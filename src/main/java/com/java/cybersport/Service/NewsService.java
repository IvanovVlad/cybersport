package com.java.cybersport.Service;

import com.java.cybersport.Entity.News;
import com.java.cybersport.Repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService implements INewsServise {
    @Autowired
    NewsRepository newsRepository;
    @Override
    public void saveNews(News news) {
        newsRepository.save(news);
    }

    @Override
    public void saveNews(List<News> news) {
        for (News n: news) {
            saveNews(n);
        }
    }

    @Override
    public List<News> getAll() {
        return (List<News>) newsRepository.findAll();
    }
}
