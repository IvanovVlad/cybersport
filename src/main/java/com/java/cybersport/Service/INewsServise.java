package com.java.cybersport.Service;

import com.java.cybersport.Entity.News;

import java.util.List;

public interface INewsServise {
    public void saveNews(News news);
    public void saveNews(List<News> news);
    public List<News> getAll();
}
