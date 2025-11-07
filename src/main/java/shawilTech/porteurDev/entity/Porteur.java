package shawiltech.com.porteurdev.entity;
import jakarta.persistence.*;
import java.util.List;

import lombok.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
