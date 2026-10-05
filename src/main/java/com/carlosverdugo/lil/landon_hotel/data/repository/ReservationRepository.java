package com.carlosverdugo.lil.landon_hotel.data.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.carlosverdugo.lil.landon_hotel.data.entity.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
  List<Reservation> findAllByReservationDate(Date date);
}
