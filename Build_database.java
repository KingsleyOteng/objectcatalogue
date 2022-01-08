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
        
   // Document page = Jsoup.connect("https://www.waterless-toilet.com/top-6-best-composting-toilets-to-choose/").get();

    
   final String html = "<td align=\"center\"><a href=\"http://www.zipcodestogo.com/Hialeah/FL/33011/\">33011</a></td> ";
    final Elements elements = Jsoup.parse(html).getElementsMatchingOwnText("^[0-9]{5,5}$");

    for (final Element element : elements) {
        System.out.println("element = [" + element + "]");
        System.out.println("zip = [" + element.text() + "]");
    }
    
    // https://aboullaite.me/jsoup-html-parser-tutorial-examples/
    String url = "http://www.google.com";
    Document doc = Jsoup.connect(url).get();
            String title = doc.title();
            System.out.println(title);
    
    }
    
    //public static String string_out() throws IOException {
    //    return "hello, it's me string_out";
    //}
}
