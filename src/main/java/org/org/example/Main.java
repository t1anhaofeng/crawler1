package org.org.example;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class Main {
    public static void main(String[] args) {
        write_to_word word = new write_to_word();
        Webspider webspider = new Webspider();
        String context = webspider.web("https://www.google.com");
        word.word(context);
    }
}