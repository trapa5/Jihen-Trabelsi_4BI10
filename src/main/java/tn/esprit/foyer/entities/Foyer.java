package tn.esprit.foyer.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.foyer.entities.Bloc;
import tn.esprit.foyer.entities.Universite;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private String nomFoyer;
    private Long capaciteFoyer;
    @OneToOne(mappedBy = "foyer", cascade = CascadeType.ALL)
    private Universite universite;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Bloc> bloc;


}