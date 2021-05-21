package com.example1.demo1.service;

import java.util.List;
import java.util.Optional;

import com.example1.demo1.model.Nota;
import com.example1.demo1.model.User;

public interface NotaService {
    Optional<Nota> findById (long id);
    List <Nota> findByUser (User id);
}
