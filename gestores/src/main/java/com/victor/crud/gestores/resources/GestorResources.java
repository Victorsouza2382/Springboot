package com.victor.crud.gestores.resources;

import com.victor.crud.gestores.domain.Gestor;
import com.victor.crud.gestores.services.GestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class GestorResources {

        @Autowired
        GestorService gestorService;
    @GetMapping("/gestores")
    public ResponseEntity<List<Gestor>> findAll() {
        List<Gestor> gestores = gestorService.findAll();
        return ResponseEntity.ok().body(gestores);
    }
}