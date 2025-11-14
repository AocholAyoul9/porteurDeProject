package shawilTech.porteurDev.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class ProjectDto {
    private Long id;
    private String titre;
    private String description;
    private LocalDate dateLivraison;
    private double budget;
    private String thematique;
    private String statut;
}
