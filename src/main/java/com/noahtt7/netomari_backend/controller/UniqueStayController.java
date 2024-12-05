package com.noahtt7.netomari_backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noahtt7.netomari_backend.dto.UniqueStayDto;
import com.noahtt7.netomari_backend.service.UniqueStayService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/uniquestays")
public class UniqueStayController {
    
    private UniqueStayService uniqueStayService;

    // Build add stay REST API
    @PostMapping
    public ResponseEntity<UniqueStayDto> createUniqueStay(@RequestBody UniqueStayDto uniqueStayDto) {
        UniqueStayDto savedStay = uniqueStayService.createUniqueStay(uniqueStayDto);
        return new ResponseEntity<>(savedStay, HttpStatus.CREATED);
    }

    // Get stay REST API
    @GetMapping("{id}")
    public ResponseEntity<UniqueStayDto> getUniqueStay(@PathVariable("id") int id) {
        UniqueStayDto getStay = uniqueStayService.getStayById(id);
        return ResponseEntity.ok(getStay);
    }
}
