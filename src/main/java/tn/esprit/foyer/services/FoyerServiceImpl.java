package tn.esprit.foyer.services;

import org.springframework.stereotype.Service;
import tn.esprit.foyer.entities.Foyer;
import tn.esprit.foyer.repositories.FoyerRepository;

import java.util.List;

@Service
public class FoyerServiceImpl implements IFoyerService {
    private final FoyerRepository foyerRepository;

    public FoyerServiceImpl(FoyerRepository foyerRepository) {
        this.foyerRepository = foyerRepository;
    }

    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void deleteFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);

    }

    @Override
    public Foyer UpdateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public List<Foyer> getAllFoyer(Foyer foyer) {
        return foyerRepository.findAll();
    }
}
