package shawilTech.porteurDev.controller;
import shawilTech.porteurDev.entity.Porteur;
import shawilTech.porteurDev.service.PorteurService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/porteurs")
public class PorteurController {

    private  final PorteurService porteurService;

    public PorteurController(PorteurService porteurService) {
        this.porteurService = porteurService;
    }

    @PostMapping
    public Porteur create(@RequestBody Porteur porteur){
        return  porteurService.createPorteur(porteur);
    }
}