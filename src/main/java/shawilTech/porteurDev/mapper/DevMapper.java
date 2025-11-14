package shawilTech.porteurDev.mapper;
import shawilTech.porteurDev.dto.CandidatureDto;
import shawilTech.porteurDev.dto.DevDto;
import shawilTech.porteurDev.dto.ProjectDto;
import shawilTech.porteurDev.entity.Candidature;
import shawilTech.porteurDev.entity.Dev;
import shawilTech.porteurDev.entity.Projet;

import java.util.stream.Collectors;

public class DevMapper {

    public static DevDto toDto(Dev dev) {
        if (dev == null) return null;

        return DevDto.builder()
                .id(dev.getId())
                .nom(dev.getNom())
                .email(dev.getEmail())
                .description(dev.getDescription())
                .technosMaitrisees(dev.getTechnosMaitrisees())
                .anciennete(dev.getAnciennete())
                .dateInscription(dev.getDateInscription())
                .build();
    }

    public static CandidatureDto toDto(Candidature c) {
        if (c == null) return null;

        return CandidatureDto.builder()
                .id(c.getId())
                .dateCandidature(c.getDateCandidature())
                .statut(c.getStatut())
                .projet(toDto(c.getProjet()))
                .build();
    }

    public static ProjectDto toDto(Projet p) {
        if (p == null) return null;

        return ProjectDto.builder()
                .id(p.getId())
                .titre(p.getTitre())
                .description(p.getDescription())
                .dateLivraison(p.getDateLivraison())
                .budget(p.getBudget())
                .thematique(p.getThematique())
                .statut(p.getStatut())
                .build();
    }
}
