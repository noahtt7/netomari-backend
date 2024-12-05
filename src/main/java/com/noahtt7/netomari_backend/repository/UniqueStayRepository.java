package com.noahtt7.netomari_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noahtt7.netomari_backend.model.UniqueStay;

public interface UniqueStayRepository extends JpaRepository<UniqueStay, Integer> {
    
}
