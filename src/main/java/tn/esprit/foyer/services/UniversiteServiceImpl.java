package tn.esprit.foyer.services;

import org.springframework.stereotype.Service;
import tn.esprit.foyer.entities.Universite;
import tn.esprit.foyer.repositories.UniversiteRepository;

import java.util.List;

@Service
public class UniversiteServiceImpl implements IUniversiteService {
    private final UniversiteRepository universiteRepository;

    public UniversiteServiceImpl(UniversiteRepository universiteRepository) {
        this.universiteRepository = universiteRepository;
    }

    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void deleteUniversite(Long idUniversite) {
        universiteRepository.deleteById(idUniversite);

    }

    @Override
    public Universite UpdateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public List<Universite> getAllUniversite(Universite universite) {
        return universiteRepository.findAll();
    }
}
