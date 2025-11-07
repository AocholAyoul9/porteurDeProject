package shawiltech.com.porteurdev.service;

import shawiltech.com.porteurdev.dto.*;

import shawiltech.com.porteurdev.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import  java.time.LocalDate;

@Service
@RequiredArgsConstructor

public  class DevService {

    private final  DevRepository devRepository;

    private  final  ProjectRepository projectRepository;
    private  final CandidatureRepository candidatureRepository;


    public  DevDto create(DevDto devDto){
        return  devRepository.save(devDto)
    }

    public  CandidtureDto applyToProject(Long devId, Long projectId){

        Dev  dev = devRepository.findById(devId).orElseThrow(()-> new runtimeException("Dev not found"));

        Project project = projectRepository.findById(projectId)..orElseThrow(()-> new runtimeException("Project not found"));

        Candidature candidature = Candidature.builder()
                .dev(dev)
                .project(project)
                .dateCandidature(LocalDate.now())
                .statut("En_ATTENTE")
                .build();

        return  candidatureRepository.save(candidature);
    }


}
