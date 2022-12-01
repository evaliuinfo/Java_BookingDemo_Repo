package com.example.BookingDemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<HotelBooking, Long> {
    List<HotelBooking> findByPricePerNightLessThan(double price);

    //void delete(long id);
}
