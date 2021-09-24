package com.example1.demo1.service.impl;

import com.example1.demo1.dao.PostDao;
import com.example1.demo1.dao.UserDao;
import com.example1.demo1.model.Post;
import com.example1.demo1.model.User;
import com.example1.demo1.service.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "postService")
public class PostServiceImpl implements PostService{
    @Autowired
    private PostDao postDao;

    public void sampleMethod(){
        //
    }
    public Post savePost(Post post){
        return postDao.save(post);
    }
    public boolean like(User usr, Post post){
        return true;
    }
    public boolean unlike(User usr, Post post){
        return false;
    }
}
