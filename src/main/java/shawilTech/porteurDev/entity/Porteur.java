package shawilTech.porteurDev.entity;
import jakarta.persistence.*;
import java.util.List;

import lombok.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Porteur{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;
    private String motDePasse;
    private String dateInscription;

    @OneToMany(mappedBy = "porteur", cascade = CascadeType.ALL)
    private List<Projet> projets;
}
