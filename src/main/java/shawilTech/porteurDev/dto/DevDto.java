package shawilTech.porteurDev.dto;
import java.time.LocalDate;

import lombok.Data;

import java.time.LocalDate;

@Data
public  class DevDto {
    private String nom;
    private String email;
    private String motDePasse;
    private String description;
    private String technosMaitrisees;
    private Integer anciennete;
    private LocalDate dateInscription;
}