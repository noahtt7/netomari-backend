package com.noahtt7.netomari_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.noahtt7.netomari_backend.model.*;
import com.noahtt7.netomari_backend.service.*;

import java.util.*;

@RestController
// @RequestMapping("/api/bookings")
public class BookingController {

    private final BookingService bookingService;
    private List<Booking> lst = List.of(new Booking("Id", "username"));

    private Map<String, UniqueStay> db = new HashMap<>() {{
        put("1", new UniqueStay(1, "treehouse"));
    }};
    //private List<UniqueStay> stays_list = List.of(new UniqueStay("1", "treehouse"));

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

    @GetMapping("/stays")
    public Collection<UniqueStay> get() {
        return db.values();
    }

    @GetMapping("/stays/{id}")
    public UniqueStay get(@PathVariable String id) {
        UniqueStay stay = db.get(id);
        if (stay == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return stay;
    }

}
