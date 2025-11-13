package shawilTech.porteurDev.dto;
import java.time.LocalDate;

import lombok.Data;

@Data
public class ProjectDto {
    private String titre;
    private String description;
    private LocalDate dateLivraison;
    private Double budget;
    private String thematique;
    private LocalDate dateCreation;
    private String statut;
}