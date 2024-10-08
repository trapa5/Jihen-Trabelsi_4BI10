package tn.esprit.foyer.services;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.hibernate.sql.Update;

import tn.esprit.foyer.entities.Foyer;
import tn.esprit.foyer.entities.Reservation;
import tn.esprit.foyer.entities.Universite;

import java.util.List;
@FieldDefaults(level = AccessLevel.PUBLIC)
public interface IUniversiteService {
    public Universite addUniversite(Universite universite);
    public void deleteUniversite(Long idUniversite);
    public Universite UpdateUniversite (Universite universite);
    List <Universite> getAllUniversite(Universite universite);
}
