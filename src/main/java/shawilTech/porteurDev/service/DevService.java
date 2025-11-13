package shawilTech.porteurDev.service;

import shawilTech.porteurDev.dto.*;
import shawilTech.porteurDev.entity.*;
import shawilTech.porteurDev.repository.*;
import org.springframework.stereotype.Service;
import shawilTech.porteurDev.repository.DevRepository;

import  java.time.LocalDate;

@Service
public  class DevService {

    private final DevRepository devRepository;

    private  final ProjectRepository projectRepository;
    private  final CandidatureRepository candidatureRepository;

    public DevService(DevRepository devRepository, ProjectRepository projectRepository, CandidatureRepository candidatureRepository) {
        this.devRepository = devRepository;
        this.projectRepository = projectRepository;
        this.candidatureRepository = candidatureRepository;
    }


    public  Dev create(Dev devDto){
        return  devRepository.save(devDto);
    }

    public  Candidature applyToProject(Long devId, Long projectId){

        Dev dev = devRepository.findById(devId).orElseThrow(()-> new RuntimeException("Dev not found"));

        Projet project = projectRepository.findById(projectId).orElseThrow(()-> new RuntimeException("Project not found"));

        Candidature candidature = Candidature.builder()
                .dev(dev)
                .projet(project)
                .dateCandidature(LocalDate.now())
                .statut("En_ATTENTE")
                .build();

        return  candidatureRepository.save(candidature);
    }


}
