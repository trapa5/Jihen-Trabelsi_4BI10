package tn.esprit.foyer.services;

import org.springframework.stereotype.Service;
import tn.esprit.foyer.entities.Bloc;
import tn.esprit.foyer.repositories.BlocRepository;
import tn.esprit.foyer.repositories.ChambreRepository;

import java.util.List;
@Service
public class BlocServiceImpl implements IBlocService {
    private final BlocRepository blocRepository;
    private final ChambreRepository chambreRepository;

    public BlocServiceImpl(BlocRepository blocRepository, ChambreRepository chambreRepository) {
        this.blocRepository = blocRepository;
        this.chambreRepository = chambreRepository;
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository .save(bloc);
    }

    @Override
    public void deleteBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);

    }

    @Override
    public Bloc UpdateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public List<Bloc> getAllBloc(Bloc bloc) {
        return blocRepository.findAll();
    }
}
