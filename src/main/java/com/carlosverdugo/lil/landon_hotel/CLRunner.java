package com.carlosverdugo.lil.landon_hotel;

import java.util.List;
// import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// import com.carlosverdugo.lil.landon_hotel.data.entity.Guest;
// import com.carlosverdugo.lil.landon_hotel.data.entity.Room;
import com.carlosverdugo.lil.landon_hotel.data.repository.GuestRepository;
import com.carlosverdugo.lil.landon_hotel.data.repository.ReservationRepository;
import com.carlosverdugo.lil.landon_hotel.data.repository.RoomRepository;
import com.carlosverdugo.lil.landon_hotel.service.RoomReservationService;
import com.carlosverdugo.lil.landon_hotel.service.model.RoomReservation;

@Component 
public class CLRunner implements CommandLineRunner {
  // private final RoomRepository roomRepository;
  // private final GuestRepository guestRepository;
  // private final ReservationRepository reservationRepository;
  private final RoomReservationService roomReservationService;

  public CLRunner (RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository, RoomReservationService roomReservationService){
    // this.roomRepository = roomRepository;
    // this.guestRepository = guestRepository;
    // this.reservationRepository = reservationRepository;
    this.roomReservationService = roomReservationService;
  }

  @Override
  public void run(String... args) throws Exception {
    // List<Room> rooms = this.roomRepository.findAll(); 
    // Optional<Room> room = this.roomRepository.findByRoomNumberIgnoreCase("p1");
    // System.out.println(room);
    // rooms.forEach(System.out::println);
    
    // System.out.println("GUESTS: ");
    // List<Guest> guests = this.guestRepository.findAll();
    // guests.forEach(System.out::println);

    // System.out.println("ROOMS: ");
    // this.roomRepository.findAll().forEach(System.out::println);

    // System.out.println("RESERVATIONS: ");
    // this.reservationRepository.findAll().forEach(System.out::println);
    

    List<RoomReservation> reservations = this.roomReservationService.getRoomReservationsForDate("2023-08-28");
    reservations.forEach(System.out::println);
  }

}
