package com.noahtt7.netomari_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Booking {
    
    @Id
    public String id;

    public String user;

    public Booking(String id, String user) {
        this.id = id;
        this.user = user;
    }
}
