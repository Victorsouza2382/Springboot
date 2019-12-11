package com.victor.crud.gestores.resources;

import com.victor.crud.gestores.domain.Gestor;
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

    @GetMapping("/gestores")
    public ResponseEntity<List<Gestor>> findAll() {
        List<Gestor> gestores = new ArrayList<>();
        Gestor joao = new Gestor ("João", "Souza", "joao@gmail.com");
        Gestor maria = new Gestor ("Maria", "Teixeira", "maria@gmail.com");
        gestores.addAll(Arrays.asList(joao, maria ));
        return ResponseEntity.ok().body(gestores);

    }
}