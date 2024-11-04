package com.noahtt7.netomari_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "uniquestay")
public class UniqueStay {
    
    @Id
    public String id;

    public String name;

    public UniqueStay(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
