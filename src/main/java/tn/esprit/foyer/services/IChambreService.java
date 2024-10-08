package tn.esprit.foyer.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.hibernate.sql.Update;
import tn.esprit.foyer.entities.Chambre;

import java.util.List;
@FieldDefaults(level = AccessLevel.PUBLIC)
public interface IChambreService {
    public Chambre addChambre(Chambre chambre);
    public void deleteChambre(Long idChambre);
    public Chambre UpdateChambre (Chambre chambre);
    List <Chambre> getAllChambre(Chambre chambre);


}