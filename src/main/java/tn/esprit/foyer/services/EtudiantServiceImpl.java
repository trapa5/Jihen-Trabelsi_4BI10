package tn.esprit.foyer.services;

import org.springframework.stereotype.Service;
import tn.esprit.foyer.entities.Etudiant;
import tn.esprit.foyer.repositories.EtudiantRepository;

import java.util.List;

@Service
public class EtudiantServiceImpl implements IEtudiantService {
    private final EtudiantRepository etudiantRepository;

    public EtudiantServiceImpl(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void deleteEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);

    }

    @Override
    public Etudiant UpdateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public List<Etudiant> getAllEtudiant(Etudiant etudiant) {
        return etudiantRepository.findAll();
    }
}
