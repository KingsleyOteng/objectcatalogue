/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_builder;

/**
 *
 * @author kwadwooteng-amoako
 * @date january 6th 2022
 */


import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Build_database  {
    
    public static void main() throws IOException {
        
    Document page = Jsoup.connect("https://www.waterless-toilet.com/top-6-best-composting-toilets-to-choose/").get();

    //selecting all hyperlinks
    Elements pageElements = page.select("a[href]");

    ArrayList<String> hyperLinks = new ArrayList<String>();
    
    
    }
    
    //public static String string_out() throws IOException {
    //    return "hello, it's me string_out";
    //}
}
