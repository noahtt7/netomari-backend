package com.noahtt7.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "uniquestay")
public class UniqueStay {
    
    @Id
    private String id;

    private String name;

    public UniqueStay() {
        
    }
}
