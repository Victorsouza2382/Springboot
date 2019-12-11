package com.victor.crud.gestores.repository;

import com.victor.crud.gestores.domain.Gestor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GestorRepository extends MongoRepository<Gestor, String> {
    Optional<Gestor> findByEmail(String email);


}
