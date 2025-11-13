package shawilTech.porteurDev.entity;

import lombok.*;
        import jakarta.persistence.*;
        import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Candidature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dateCandidature;
    private String statut;

    @ManyToOne
    @JoinColumn(name = "dev_id")
    private Dev dev;

    @ManyToOne
    @JoinColumn(name = "projet_id")
    private Projet projet;
}

