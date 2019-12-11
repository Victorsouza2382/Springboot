package com.victor.crud.gestores.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Objects;

@Document
public class Gestor implements Serializable {
    private static final long serialversionUID = 1L;
@Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;

    public Gestor() {
    }

    public Gestor(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gestor)) return false;
        Gestor gestor = (Gestor) o;
        return Objects.equals(id, gestor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
