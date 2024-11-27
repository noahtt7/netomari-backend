package com.noahtt7.netomari_backend.mapper;

import com.noahtt7.netomari_backend.dto.UniqueStayDto;
import com.noahtt7.netomari_backend.model.UniqueStay;

public class UniqueStayMapper {

    // Maps UniqueStay entity to UniqueStayDto
    public static UniqueStayDto mapToStayDto(UniqueStay uniqueStay) {
        return new UniqueStayDto(
            uniqueStay.getId(),
            uniqueStay.getName()
        );
    }

    // Maps UniqueStayDto to UniqueStay entity
    public static UniqueStay mapToStay(UniqueStayDto uniqueStayDto) {
        return new UniqueStay(
            uniqueStayDto.getId(),
            uniqueStayDto.getName()
        );
    }
}
