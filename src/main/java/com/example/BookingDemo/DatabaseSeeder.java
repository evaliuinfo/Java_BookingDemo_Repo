package com.example.BookingDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {
    private BookingRepository bookingRepository;

    @Autowired
    public DatabaseSeeder(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        //HotelBooking hotelBooking1 = new HotelBooking("Marriot", 200.3, 3);
        //HotelBooking hotelBooking2 = new HotelBooking("Ibis", 90, 4);
        //HotelBooking hotelBooking3 = new HotelBooking("Novotel", 140.7, 1);
        //bookingRepository.save(hotelBooking1);
        //bookingRepository.save(hotelBooking2);
        //bookingRepository.save(hotelBooking3);
    }

}
