package com.noahtt7.netomari_backend.service;

import java.util.List;

import com.noahtt7.netomari_backend.dto.UniqueStayDto;

public interface UniqueStayService {
    UniqueStayDto createUniqueStay(UniqueStayDto uniqueStayDto);
    
    UniqueStayDto getStayById(int id);

    List<UniqueStayDto> getAllStays();

    UniqueStayDto updateStay(int stayId, UniqueStayDto updatedStay);
}
