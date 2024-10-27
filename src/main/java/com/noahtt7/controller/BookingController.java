package com.noahtt7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.noahtt7.service.*;
import com.noahtt7.model.*;
import java.util.*;

@RestController
// @RequestMapping("/api/bookings")
public class BookingController {

    private final BookingService bookingService;
    private List<Booking> lst = List.of(new Booking("Id", "username"));

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }
    
    @GetMapping("/all")
    public List<Booking> getAllBookings() {
        //return bookingService.getAllBookings();
        return lst;
    }

    @GetMapping("/create")
    public Booking createBooking(@RequestBody Booking newBooking) {
        return bookingService.createBooking(newBooking);
    }

}
