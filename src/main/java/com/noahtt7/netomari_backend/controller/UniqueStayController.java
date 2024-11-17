package com.noahtt7.netomari_backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.noahtt7.netomari_backend.service.UniqueStayService;

@Controller
public class UniqueStayController {
    
    private UniqueStayService uniqueStayService;

    public UniqueStayController(UniqueStayService uniqueStayService) {
        super();
        this.uniqueStayService = uniqueStayService;
    }

    // handler method to handle list stays
    @GetMapping("/stays")
    public String listStays(Model model) {
        model.addAttribute("stays", uniqueStayService.getAllStays());
        return "stays";
    }
}
