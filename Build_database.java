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
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    
    try {
    
    // https://aboullaite.me/jsoup-html-parser-tutorial-examples/
    String url = "https://celestrak.com/NORAD/elements/tle-new.txt";
    Document doc = Jsoup.connect(url).get();
            String title = doc.title();
            System.out.println(doc.text());
            
            Pattern p = Pattern.compile("([A-Z])\\w+-([0-9])+");
            Matcher matcher = p.matcher(doc.text());
            Set<String> emails = new HashSet<String>();
        while (matcher.find()) {
            emails.add(matcher.group());
            System.out.println(matcher.group());
        }
    }
    catch (IOException e) 
    {
			e.printStackTrace();
    }
            
    
    }
    
    //public static String string_out() throws IOException {
    //    return "hello, it's me string_out";
    //}
}
