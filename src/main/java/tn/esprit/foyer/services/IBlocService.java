package tn.esprit.foyer.services;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.hibernate.sql.Update;
import tn.esprit.foyer.entities.Bloc;
import tn.esprit.foyer.entities.Chambre;

import java.util.List;
@FieldDefaults(level = AccessLevel.PUBLIC)
public interface IBlocService {
    public Bloc addBloc(Bloc bloc);
    public void deleteBloc(Long idBloc);
    public Bloc UpdateBloc (Bloc bloc);
    List <Bloc> getAllBloc(Bloc bloc);
}
