package shawilTech.porteurDev.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class CandidatureDto {
    private Long id;
    private LocalDate dateCandidature;
    private String statut;
    private ProjectDto projet;
}
