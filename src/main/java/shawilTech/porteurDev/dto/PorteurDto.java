package shawilTech.porteurDev.dto;

import lombok.Data;


@Data
public  class PorteurDto {

    private Long id;
    private String nom;
    private String email;
    private String motDePasse;
    private String dateInscription;
}