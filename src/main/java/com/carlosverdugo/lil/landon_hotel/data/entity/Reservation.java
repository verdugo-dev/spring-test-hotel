package com.carlosverdugo.lil.landon_hotel.data.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="reservations", schema = "LIL")
@Data
@ToString
public class Reservation {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "reservation_id")
  private long id;

  @Column(name = "room_id")
  private long roomId;

  @Column(name = "guest_id")
  private long guestId;

  @Column(name = "res_date")
  private Date reservationDate;

  @ManyToOne
  @JoinColumn(name="room_id", insertable = false, updatable = false)
  private Room room; 

  @ManyToOne
  @JoinColumn(name="guest_id", insertable = false, updatable = false)
  private Guest guest; 

  
}
