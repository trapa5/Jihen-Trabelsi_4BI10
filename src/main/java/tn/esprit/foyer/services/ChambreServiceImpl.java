package tn.esprit.foyer.services;

import org.springframework.stereotype.Service;
import tn.esprit.foyer.entities.Chambre;
import tn.esprit.foyer.repositories.ChambreRepository;

import java.util.List;

@Service
public class ChambreServiceImpl implements IChambreService {
    private final ChambreRepository chambreRepository;

    public ChambreServiceImpl(ChambreRepository chambreRepository) {
        this.chambreRepository = chambreRepository;
    }

    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre)  ;
    }

    @Override
    public void deleteChambre(Long idChambre) {
        chambreRepository.deleteById(idChambre);

    }

    @Override
    public Chambre UpdateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> getAllChambre(Chambre chambre) {
        return chambreRepository.findAll();
    }
}
