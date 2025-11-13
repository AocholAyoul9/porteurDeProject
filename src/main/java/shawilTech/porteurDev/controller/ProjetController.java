package shawilTech.porteurDev.controller;
import shawilTech.porteurDev.dto.CandidatureDto;
import shawilTech.porteurDev.dto.ProjectDto;
import shawilTech.porteurDev.entity.Candidature;
import shawilTech.porteurDev.entity.Projet;
import shawilTech.porteurDev.service.ProjectService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import  java.util.List;

@RestController
@RequestMapping("/api/projects")
public  class ProjetController {

    final ProjectService projectService;

    public ProjetController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping("/{porteurId}")
    public Projet create(@PathVariable Long porteurId, @RequestBody Projet project){
        return  projectService.createProject(porteurId, project);
    }

    @GetMapping("/{projectId}/canditures")
    public  List<Candidature> listCandidatures(@PathVariable Long projectId){
        return  projectService.listCandidatures(projectId);
    }

    @PutMapping("/candidatures/{id}/accept")
    public  Candidature accept(@PathVariable Long id){
        return  projectService.acceptCandidature(id);
    }

    @PutMapping("/candidatures/{id}/refuse")
    public Candidature refuse(@PathVariable Long id) {
        return projectService.refusCandidature(id);
    }
}