package com.noahtt7.netomari_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.noahtt7.netomari_backend.model.UniqueStay;
import com.noahtt7.netomari_backend.repository.UniqueStayRepository;

@Service
public class StayServiceImpl implements UniqueStayService {

    // inject dependency
    private UniqueStayRepository uniqueStayRepository;

    public StayServiceImpl(UniqueStayRepository uniqueStayRepository) {
        super();
        this.uniqueStayRepository = uniqueStayRepository;
    }

    @Override
    public List<UniqueStay> getAllStays() {
        return uniqueStayRepository.findAll();
    }
    
}
