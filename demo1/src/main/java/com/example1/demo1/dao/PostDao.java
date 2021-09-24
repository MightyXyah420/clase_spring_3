package com.example1.demo1.dao;

import com.example1.demo1.model.Post;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface PostDao extends CrudRepository <Post, Long> {
    
}
