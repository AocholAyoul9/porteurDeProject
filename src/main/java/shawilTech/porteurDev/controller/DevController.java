package shawilTech.porteurDev.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import shawilTech.porteurDev.dto.*;
import shawilTech.porteurDev.entity.*;
import shawilTech.porteurDev.service.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import shawilTech.porteurDev.service.DevService;

@RestController
@RequestMapping("/api/devs")
@RequiredArgsConstructor
public class DevController {

    private final DevService devService;

    @PostMapping
    public  DevDto create(@RequestBody DevDto dev){
        return devService.create(dev);
    }

    @PostMapping("/{devId}/apply/{projectId}")
    public  CandidatureDto apply(@PathVariable Long devId, @PathVariable Long projectId){
        return  devService.applyToProject(devId, projectId);
    }
}