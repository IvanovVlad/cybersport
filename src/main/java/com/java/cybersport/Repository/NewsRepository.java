package com.java.cybersport.Repository;

import com.java.cybersport.Entity.News;
import org.springframework.data.repository.CrudRepository;

public interface NewsRepository extends CrudRepository<News, Integer> { }