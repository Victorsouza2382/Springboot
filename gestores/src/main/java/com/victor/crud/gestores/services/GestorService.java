package com.victor.crud.gestores.services;

import com.victor.crud.gestores.domain.Gestor;
import com.victor.crud.gestores.repository.GestorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestorService {

        @Autowired
    private GestorRepository gestorRepository;

        public List<Gestor> findAll(){
            return gestorRepository.findAll();


        }


}
