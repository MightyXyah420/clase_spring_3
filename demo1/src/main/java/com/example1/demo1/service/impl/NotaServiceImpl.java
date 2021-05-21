package com.example1.demo1.service.impl;

import java.util.List;
import java.util.Optional;

import com.example1.demo1.dao.NotaDao;
import com.example1.demo1.dao.RoleDao;
import com.example1.demo1.model.Nota;
import com.example1.demo1.model.User;
import com.example1.demo1.service.NotaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "notaService")
public class NotaServiceImpl implements NotaService {
    @Autowired
    private NotaDao notaDao;
    @Override
    public Optional<Nota> findById(long id) {
        // TODO Auto-generated method stub
        return notaDao.findById(id);
    }

    @Override
    public List<Nota> findByUser(User user) {
        // TODO Auto-generated method stub
        return notaDao.findByUser(user);
    }
    public Nota saveNota(Nota nota){
        return notaDao.save(nota);
    }
    
}
