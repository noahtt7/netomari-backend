package com.noahtt7.netomari_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import com.noahtt7.netomari_backend.model.*;
import com.noahtt7.netomari_backend.repository.BookingRepository;

@Service
public class BookingService {

    // @Autowired
    private final BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }
}