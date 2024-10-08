package tn.esprit.foyer.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.hibernate.sql.Update;
import tn.esprit.foyer.entities.Chambre;
import tn.esprit.foyer.entities.Etudiant;

import java.util.List;
@FieldDefaults(level = AccessLevel.PUBLIC)
public interface IEtudiantService {
    public Etudiant addEtudiant(Etudiant etudiant);
    public void deleteEtudiant(Long idEtudiant);
    public Etudiant UpdateEtudiant (Etudiant etudiant);
    List <Etudiant> getAllEtudiant(Etudiant etudiant);
}
