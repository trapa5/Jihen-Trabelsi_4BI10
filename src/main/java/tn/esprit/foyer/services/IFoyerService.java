package tn.esprit.foyer.services;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.hibernate.sql.Update;
import tn.esprit.foyer.entities.Chambre;
import tn.esprit.foyer.entities.Etudiant;
import tn.esprit.foyer.entities.Foyer;

import java.util.List;
@FieldDefaults(level = AccessLevel.PUBLIC)
public interface IFoyerService {
    public Foyer addFoyer(Foyer foyer);
    public void deleteFoyer(Long idFoyer);
    public Foyer UpdateFoyer (Foyer foyer);
    List <Foyer> getAllFoyer(Foyer foyer);
}
