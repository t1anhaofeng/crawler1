package org.org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Webspider {
    public static String web(String url){
        String result = "";

        try {
            Document document = Jsoup.connect(url).get();
            String title = document.title();
            System.out.println("Title: " + title);
            result += title + " ";
            System.out.println(result);

            // Additional logic to follow links, parse content, etc.

            Elements para = document.select("[type='text']");
            System.out.println("11");
            for(Element p: para){
                result += p.text() + " ";
                System.out.println(p.text()+" ");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
