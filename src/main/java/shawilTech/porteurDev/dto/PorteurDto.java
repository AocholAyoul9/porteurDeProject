package shawilTech.porteurDev.dto;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public  class PorteurDto {

    private Long id;
    private String nom;
    private String email;
    private String motDePasse;
    private String dateInscription;
}