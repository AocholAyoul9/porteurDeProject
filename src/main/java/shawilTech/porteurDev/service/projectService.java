package shawiltech.com.porteurdev.service;

import shawiltech.com.porteurdev.dto.*;

import shawiltech.com.porteurdev.entity.*;
import shawiltech.com.porteurdev.dto.PorteurDto;

import shawiltech.com.porteurdev.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import  java.util.List;


@Service
@RequiredArgsConstructor
public  class projectService {

    private  final  ProjectRepository projectRepository;
    private  final  PorteurRepository porteurRepository;
    private  final  CandidatureRepository candidatureRepository;
    private  final  DevRepository devRepository;

    public  ProjectDto createProject(Long porteurId, ProjectDto projectDto){

        PorteurDto  porteur = porteurRepository.findById(porteurId)
                .orElseThrow(()-> new RuntimeException("Porteur not foud"));
        projectDto.setPorteur(porteur);

        return  projectRepository.save(projectDto);
    }

    public  List<CandidatureDto> listCandidatures(Long projectId){
        return  candidatureRepository.findByProjectId(projectId);
    }

    public  CandidatureDto acceptCandidature(Long candidatureId){
        CandidatureDto candidature = candidatureRepository.findBy(candidatureId)
                .orElseThrow(()-> new RuntimeException("Candidature not found"));
        candidature.setStatut("ACCEPTEE");

        return  candidatureRepository.save(candidature);
    }

    public  CandidatureDto refusCandidature(Long candidatureId){
        CandidatureDto candidature = candidatureRepository.findBy(candidatureId)
                .orElseThrow(()-> new RuntimeException("Candidature not found"));
        candidature.setStatut("REFUSEE");

        return  candidatureRepository.save(candidature);
    }
}