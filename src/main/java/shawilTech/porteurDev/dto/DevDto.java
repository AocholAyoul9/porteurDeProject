package shawilTech.porteurDev.dto;

import lombok.Builder;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class DevDto {
    private Long id;
    private String nom;
    private String email;
    private String description;
    private String technosMaitrisees;
    private Integer anciennete;
    private LocalDate dateInscription;
    private List<CandidatureDto> candidatures;
}
