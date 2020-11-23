package com.example.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.net.URL;


public class HtmlParseUtil {
    public static void main(String[] args) throws IOException {
//        String url = "https://search.jd.com/Search?keyword=java";
        String url = "https://search.jd.com/Search?keyword=java";
        //解析网页，返回javascript
        Document document = Jsoup.parse(new URL(url), 30000);
        Element element = document.getElementById("J_goodsList");
        System.out.println(element.html());
    }

}
