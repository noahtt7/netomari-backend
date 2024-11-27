package com.noahtt7.netomari_backend.model;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "uniquestay")
public class UniqueStay {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String id;

    public String name;

    public UniqueStay() {
        
    }

    public UniqueStay(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
