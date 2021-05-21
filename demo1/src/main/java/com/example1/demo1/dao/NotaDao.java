package com.example1.demo1.dao;

import java.util.List;

import com.example1.demo1.model.Nota;
import com.example1.demo1.model.User;

import org.springframework.data.repository.CrudRepository;

public interface NotaDao extends CrudRepository <Nota, Long> {
    List <Nota> findByUser(User user);
}
