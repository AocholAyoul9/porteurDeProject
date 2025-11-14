package shawilTech.porteurDev.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dev {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;
    private String motDePasse;
    private String description;
    private String technosMaitrisees;
    private Integer anciennete;
    private LocalDate dateInscription;

    @OneToMany(mappedBy = "dev", cascade = CascadeType.ALL)
    private List<Candidature> candidatures;
}
