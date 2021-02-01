package com.java.cybersport;

import com.java.cybersport.Entity.News;
import com.java.cybersport.Tools.HTMLloader;
import com.java.cybersport.Tools.Parser;
import com.java.cybersport.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.List;

@SpringBootApplication
public class CybersportApplication {
    @Autowired
    NewsService newsService;

    public static void main(String[] args) {
        SpringApplication.run(CybersportApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {
        Parser parser = new Parser(new HTMLloader().sendRequest("https://www.cybersport.ru/"));
        List<News> newsList = parser.parse();
        newsService.saveNews(newsList);

        for (News n : newsService.getAll()) {
        	System.out.println(n);
		}
    }

}
