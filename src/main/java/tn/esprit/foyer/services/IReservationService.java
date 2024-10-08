package tn.esprit.foyer.services;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.hibernate.sql.Update;

import tn.esprit.foyer.entities.Foyer;
import tn.esprit.foyer.entities.Reservation;

import java.util.List;

public interface IReservationService {
    public Reservation addReservation(Reservation reservation);
    public void deleteReservation(String idReservation);
    public Reservation UpdateReservation (Reservation reservation);
    List <Reservation> getAllReservation();
}

