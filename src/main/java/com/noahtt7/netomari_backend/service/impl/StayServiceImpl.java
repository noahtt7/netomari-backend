package com.noahtt7.netomari_backend.service.impl;

import org.springframework.stereotype.Service;

import com.noahtt7.netomari_backend.dto.UniqueStayDto;
import com.noahtt7.netomari_backend.mapper.UniqueStayMapper;
import com.noahtt7.netomari_backend.model.UniqueStay;
import com.noahtt7.netomari_backend.repository.UniqueStayRepository;
import com.noahtt7.netomari_backend.service.UniqueStayService;

import exception.ResourceNotFoundException;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StayServiceImpl implements UniqueStayService {

    private UniqueStayRepository uniqueStayRepository;
    @Override
    public UniqueStayDto createUniqueStay(UniqueStayDto uniqueStayDto) {
        // Convert UniqueStayDto into UniqueStay JPA Entity
        // Need to store entity into database
        UniqueStay uniqueStay = UniqueStayMapper.mapToStay(uniqueStayDto);
        UniqueStay savedStay = uniqueStayRepository.save(uniqueStay); // Save into database

        // Return saved uniquestay object back to client
        return UniqueStayMapper.mapToStayDto(savedStay);
    }

    @Override
    public UniqueStayDto getStayById(int id) {
        // Get an existing stay by its id
        // If it doesn't exist, throw a ResourceNotFoundException
        UniqueStay stay = uniqueStayRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Stay doesn't exist with given id: " + id));

        return UniqueStayMapper.mapToStayDto(stay);
    }
}
