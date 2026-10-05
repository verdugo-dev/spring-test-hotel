package com.carlosverdugo.lil.landon_hotel;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.carlosverdugo.lil.landon_hotel.data.entity.Room;
import com.carlosverdugo.lil.landon_hotel.data.repository.RoomRepository;

@Component 
public class CLRunner implements CommandLineRunner {

  private final RoomRepository roomRepository;

  public CLRunner (RoomRepository roomRepository){
    this.roomRepository = roomRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    List<Room> rooms = this.roomRepository.findAll(); 
    Optional<Room> room = this.roomRepository.findByRoomNumberIgnoreCase("p1");

    System.out.println(room);
    rooms.forEach(System.out::println);
    
  }

}
