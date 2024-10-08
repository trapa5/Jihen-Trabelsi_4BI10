package tn.esprit.foyer.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.foyer.entities.Reservation;
import tn.esprit.foyer.repositories.ReservationRepository;

import java.util.List;

@Service

public class ReservationServiceImpl implements IReservationService {
    @Autowired
    ReservationRepository reservationRepository;

    public ReservationServiceImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(String idReservation) {
        reservationRepository.deleteById(idReservation);
    }


    @Override
    public Reservation UpdateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> getAllReservation() {
        return reservationRepository.findAll();
    }

}
