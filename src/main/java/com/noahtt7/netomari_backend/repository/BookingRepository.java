package com.noahtt7.netomari_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.noahtt7.netomari_backend.model.*;

@Repository
public interface BookingRepository extends JpaRepository<Booking, String> {

    //UniqueStay findByStay(String id);
    
}
