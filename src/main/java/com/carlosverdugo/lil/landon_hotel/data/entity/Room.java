package com.carlosverdugo.lil.landon_hotel.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity 
@Table(name="rooms", schema = "LIL")
@Data 
@ToString 
public class Room {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column (name="room_id")
  private long id;
  
  @Column (name="name")
  private String name;
  
  @Column (name="room_number")
  private String roomNumber;
  
  @Column (name="bed_info")
  private String bedInfo; 
  

}
