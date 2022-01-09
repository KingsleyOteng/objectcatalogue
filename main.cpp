//
//  main.cpp
//  satellite_tracker
//
//  Created by Kwadwo Oteng-Amoako on 04/01/2022.
//

//
//      Overview: We implement here a tracking tool based off of NORAD Two-Line Element Sets.
//      We then propogage using SGP4 and also higher
//
//      Created by Kwadwo Oteng-Amoko on 14/01/2020.
//      Copyright © 2020,2021 Kwadwo Oteng-Amoko. All rights reserved.
//
#define Re                      6378.1370               // the earths radius; from Kelso
#define we                      0.0000729211510        // Earth's rotation rate in radians/second; from Kelso

// system files and preprocessor instructions
#include <algorithm>                  // c-11 algoithm, vector libraries are used
#include <array>
#include <cmath>
#include <fstream>
#include <iterator>
#include <iostream>
#include <stdlib.h>
#include <string>
#include <stdio.h>
#include <time.h>
#include <vector>
#include <limits>
#include <cctype>
#include <iomanip>

// third party apis
//#include <boost/any.hpp>               // boost standard library
//#include <boost/asio.hpp>              // io streaming headers
//#include <boost/date_time/gregorian/gregorian.hpp>
//#include <boost/lambda/lambda.hpp>
//#include <boost/xpressive/xpressive.hpp>

// user defined classes
//#include "orbital.hpp"                 // header files
//#include "BenchMarking.hpp"            // benchmarking routines
//#include "time_files.hpp"
//#include "sgp4.hpp"
//#include "sdp4.hpp"
//#include "coordinate_transforms.hpp"   // coordinate transforms library
//#include "configuration_system.hpp"
//#include "utilities.hpp"               // my own routines for processing data

//#include <cppconn/driver.h> //#include <cppconn/exception.h> //#include <cppconn/prepared_statement.h>

// declare the namespace
using namespace std;
//using namespace boost::gregorian;

//using namespace soci;
// https://medium.com/@dane.bulat/working-with-databases-in-c-an-introduction-7d6a6a78ae66
double frac_hours, hours_example, hours_final, min_final, seconds_final;
const string server     = "156.67.222.64";
const string username   = "u311839917_koteng";
const string password   = "Mypass1234!";
double ctime_example;
std::string input_tle_number;
std::string date_value;
std::string user_input;
std::string configuration_file;

int main()
{
    cout << "cout" << "\n";
    //orbital *orb = new orbital(12,13,14);
    //utilities *util = new utilities();
    std::tm tm = {0};
    double year = 1900 + tm.tm_year;
    double month = tm.tm_mon;
    long double day = (double)(tm.tm_mday + (double(tm.tm_hour))/24 + (double(tm.tm_min))/(24*60)  + (double(tm.tm_sec))/(24*60*60));
    double C,D,jd;
    double A = trunc(year/100);
    double B = 2 - A + trunc(A/4);
    double yearp, monthp;
    double jd_out;
    double BB,E,F,G,I;
    double day_final, month_final, year_final;
    double dayg, monthg, yearg;
    double frac_days, days_gg;
    
    // map to the TLE resoure
    // then open the resource
    //orb -> setURLData("https://celestrak.com/satcat/tle.php?CATNR=43108");
    
    
    cout << "hello" << "\n";
    return 00;
}
