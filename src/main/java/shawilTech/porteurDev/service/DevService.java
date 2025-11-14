package shawilTech.porteurDev.service;

import org.springframework.stereotype.Service;
import shawilTech.porteurDev.dto.CandidatureDto;
import shawilTech.porteurDev.dto.DevDto;
import shawilTech.porteurDev.entity.Candidature;
import shawilTech.porteurDev.entity.Dev;
import shawilTech.porteurDev.entity.Projet;
import shawilTech.porteurDev.mapper.DevMapper;
import shawilTech.porteurDev.repository.CandidatureRepository;
import shawilTech.porteurDev.repository.DevRepository;
import shawilTech.porteurDev.repository.ProjectRepository;

import java.time.LocalDate;

@Service
public class DevService {

    private final DevRepository devRepository;
    private final ProjectRepository projectRepository;
    private final CandidatureRepository candidatureRepository;

    public DevService(DevRepository devRepository, ProjectRepository projectRepository, CandidatureRepository candidatureRepository) {
        this.devRepository = devRepository;
        this.projectRepository = projectRepository;
        this.candidatureRepository = candidatureRepository;
    }

    public DevDto create(Dev dev){
        Dev savedDev = devRepository.save(dev);
        return DevMapper.toDto(savedDev);
    }

    public CandidatureDto applyToProject(Long devId, Long projectId){
        Dev dev = devRepository.findById(devId)
                .orElseThrow(() -> new RuntimeException("Dev not found"));

        Projet project = projectRepository.findById(projectId)
                .orElseThrow(() -> new RuntimeException("Project not found"));

        Candidature candidature = Candidature.builder()
                .dev(dev)
                .projet(project)
                .dateCandidature(LocalDate.now())
                .statut("En_ATTENTE")
                .build();

        Candidature savedCandidature = candidatureRepository.save(candidature);
        return DevMapper.toDto(savedCandidature);
    }
}
