
package shawilTech.porteurDev.dto;
import java.time.LocalDate;
import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public  class CandidatureDto {
    private LocalDate dateCandidature;
    private String statut;
}