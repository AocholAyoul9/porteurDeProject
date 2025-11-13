package shawilTech.porteurDev.controller;
import shawilTech.porteurDev.dto.CandidatureDto;
import shawilTech.porteurDev.dto.ProjectDto;
import shawilTech.porteurDev.entity.*;
import shawilTech.porteurDev.dto.CandidatureDto;
import shawilTech.porteurDev.entity.Candidature;
import shawilTech.porteurDev.dto.ProjectDto;
import shawilTech.porteurDev.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import  java.util.List;

@RestController
@RequestMapping("/api/projects")
@RequiredArgsConstructor
public  class ProjetController {

    private final  ProjectService projectService;

    @PostMapping("/{porteurId}")
    public ProjectDto create(@PathVariable Long porteurId, @RequestBody ProjectDto project){
        return  projectService.createProject(porteurId, project);
    }

    @GetMapping("/{projectId}/canditures")
    public  List<CandidatureDto> listCandidatures(@PathVariable Long projectId){
        return  projectService.listCandidatures(projectId);
    }

    @PutMapping("/candidatures/{id}/accept")
    public  CandidatureDto accept(@PathVarible Long id){
        return  projectService.acceptCandidature(id);
    }

    @PutMapping("/candidatures/{id}/refuse")
    public Candidature refuse(@PathVariable Long id) {
        return projectService.refuseCandidature(id);
    }
}