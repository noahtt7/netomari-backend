package com.noahtt7.netomari_backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noahtt7.netomari_backend.dto.UniqueStayDto;
import com.noahtt7.netomari_backend.service.UniqueStayService;

import lombok.AllArgsConstructor;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/uniquestays")
public class UniqueStayController {
    
    private UniqueStayService uniqueStayService;

    // Build add stay REST API
    @PostMapping("/create") 
    public ResponseEntity<UniqueStayDto> createUniqueStay(@RequestBody UniqueStayDto uniqueStayDto) {
        UniqueStayDto savedStay = uniqueStayService.createUniqueStay(uniqueStayDto);
        return new ResponseEntity<>(savedStay, HttpStatus.CREATED);
    }

    @PostMapping("/test")
    public String testPost() {
        return "POST recevied";
    }

    // Get stay REST API
    @GetMapping("{id}")
    public ResponseEntity<UniqueStayDto> getUniqueStay(@PathVariable("id") int id) {
        UniqueStayDto getStay = uniqueStayService.getStayById(id);
        return ResponseEntity.ok(getStay);
    }

    @GetMapping("getall")
    public ResponseEntity<List<UniqueStayDto>> getAllStays() {
        List<UniqueStayDto> getStays = uniqueStayService.getAllStays();
        return ResponseEntity.ok(getStays);
    }

    // Update Stay REST API
    @PutMapping("{id}")
    public ResponseEntity<UniqueStayDto> updateStay(@PathVariable("id") int id, @RequestBody UniqueStayDto updatedStay) {
        UniqueStayDto savedStayDto = uniqueStayService.updateStay(id, updatedStay);
        return ResponseEntity.ok(savedStayDto);
    }
    // Delete Stay REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStay(@PathVariable("id") int id) {
        uniqueStayService.deleteStay(id);
        return ResponseEntity.ok("Unique Stay deleted successfully.");
    }
}
