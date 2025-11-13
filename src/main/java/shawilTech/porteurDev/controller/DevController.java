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
public class DevController {

    private final DevService devService;

    public DevController(DevService devService) {
        this.devService = devService;
    }

    @PostMapping
    public  Dev create(@RequestBody Dev dev){
        return devService.create(dev);
    }

    @PostMapping("/{devId}/apply/{projectId}")
    public  Candidature apply(@PathVariable Long devId, @PathVariable Long projectId){
        return  devService.applyToProject(devId, projectId);
    }
}