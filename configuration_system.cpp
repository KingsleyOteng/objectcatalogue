//
//  configuration_systems.hpp
//  source
//
//  Created by Kwadwo Oteng-Amoko on 08/02/2021.
//  Copyright © 2020,2021 Kwadwo Oteng-Amoko. All rights reserved.
//


#include "configuration_system.hpp"
#include <iostream>
#include <fstream>
#include <string>

// third party apis
#include <boost/any.hpp>               // boost standard library
#include <boost/asio.hpp>              // io streaming headers
#include <boost/date_time/gregorian/gregorian.hpp>
#include <boost/lambda/lambda.hpp>
#include <boost/xpressive/xpressive.hpp>

using namespace std;

configuration_system::
    configuration_system()
    {}

configuration_system::
    ~configuration_system()
    {}

// returns the longitude of the sensors

double  configuration_system::getLocationLongitude()
    {
        return sensor_location_longitude;
    };


// returns the sensors name

char*   configuration_system::getSensor()
    {
        return sensor_name;
    };


// returns the location height

double  configuration_system::getLocationHeight()
    {
        return sensor_location_height;
    };


// returns the current month

int     configuration_system::getMonth()
    {
        return current_month;
    };

// returns the time in HHMMSS that the sun is expected to set
int     configuration_system::getSunRise()
    {
        return (sunrise_time);
    };


// returns the time in HHMMSS that the sun is expected to set

int     configuration_system::getSunSet()
    {
        return (sunset_time);
    };


// returns the albedo of the space object

double  configuration_system::getObjectAlbedo()
    {
        return object_albedo;
    };


// returns the number of available sensors

int configuration_system::getNumberOfSensorsAvailable()
    {
        return number_of_sensors;
    }


bool configuration_system::read_configuration_file()
{
    std::ifstream myfile;
    myfile.open("configuration.dat");
    std::string myline;
    
    // introduce regex here
       std::string phrase;
       std::string captures;

    if ( myfile.is_open() )
    {
        while ( myfile )
            {
                
                std::getline (myfile, myline);
               
                cout << "data: >>>>>>>>>>>>>>>> " << myline << "\n";
                
                // the goal here is to parse a system configuration file and use it to set the sensor
                
                boost::xpressive::sregex rex = boost::xpressive::sregex::compile( "(\\w+) (\\w+)!" );
                boost::xpressive::smatch what;
                
                if( regex_match( captures, what, rex ) )
                  {
                      cout << "result 1:" << what << "\n";
                      cout << "result 2:" << captures << "\n";
                      cout << "result 3:" << rex << "\n";
                  }
            }
    };
    

    return 0;
}
