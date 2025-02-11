package com.java.cybersport.Tools;

import com.java.cybersport.Entity.News;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    private String document;

    public Parser(String address) {
        this.document = address;
    }

    public List<News> parse() {
        List<News> results = new ArrayList<>();

        Pattern pattern = Pattern.compile("class=\"title_.*\">(.*)</h3>");
        Matcher matcher = pattern.matcher(document);

        for (int i = 0; i < 3; i++) {
            matcher.find();
            results.add(
                    new News(matcher.group(1))
            );
        }

        return results;
    }
}

