package shawilTech.porteurDev.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String description;
    private LocalDate dateLivraison;
    private Double budget;
    private String thematique;
    private LocalDate dateCreation;
    private String statut;

    @ManyToOne
    @JoinColumn(name = "porteur_id")
    private Porteur porteur;

    @OneToMany(mappedBy = "projet", cascade = CascadeType.ALL)
    private List<Candidature> candidatures;
}
