package shawilTech.porteurDev.service;

import shawilTech.porteurDev.dto.*;

import shawilTech.porteurDev.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shawilTech.porteurDev.repository.DevRepository;

import  java.time.LocalDate;

@Service
@RequiredArgsConstructor
public  class DevService {

    private final DevRepository devRepository;

    private  final ProjectRepository projectRepository;
    private  final shawiltech.com.porteurdev.repository.CandidatureRepository candidatureRepository;


    public  DevDto create(DevDto devDto){
        return  devRepository.save(devDto);
    }

    public  CandidtureDto applyToProject(Long devId, Long projectId){

        shawiltech.com.porteurdev.entity.Dev dev = devRepository.findById(devId).orElseThrow(()-> new runtimeException("Dev not found"));

        Project project = projectRepository.findById(projectId).orElseThrow(()-> new runtimeException("Project not found"));

        shawiltech.com.porteurdev.entity.Candidature candidature = Candidature.builder()
                .dev(dev)
                .project(project)
                .dateCandidature(LocalDate.now())
                .statut("En_ATTENTE")
                .build();

        return  candidatureRepository.save(candidature);
    }


}
