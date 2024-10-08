package tn.esprit.foyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer.entities.Reservation;
@Repository
public interface ReservationRepository extends JpaRepository<Reservation,String> {
}