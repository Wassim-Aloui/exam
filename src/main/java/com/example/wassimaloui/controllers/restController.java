package com.example.wassimaloui.controllers;

import com.example.wassimaloui.entities.Parking;
import com.example.wassimaloui.entities.Personnel;
import com.example.wassimaloui.entities.Poste;
import com.example.wassimaloui.entities.Zone;
import com.example.wassimaloui.repositories.parkingRepository;
import com.example.wassimaloui.repositories.personnelRepository;
import com.example.wassimaloui.repositories.zoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.spi.TimeZoneNameProvider;

@RestController
@RequestMapping("rest")
public class restController {

    @Autowired
    parkingRepository parkingRepo;
    @Autowired
    personnelRepository personnelRepo;
    @Autowired
    zoneRepository zoneRepos;


    @PostMapping("/addPersonnel")
    public Personnel ajouterPersonnel(@RequestBody Personnel personnel) {
        return	personnelRepo.save(personnel);
    }

    @PostMapping("/addParking")
    public void ajoutParkingZones(@RequestBody Parking parking) {
        parkingRepo.save(parking);
    }

    @GetMapping("/affecter/{idZone}/{idGarde}")
    public void affecterUtilisateurClasse(@PathVariable int idZone, @PathVariable Integer idGarde ) {

        Zone zone =zoneRepos.findById(idZone).orElse(null);
        Personnel presonnel =personnelRepo.findById(idGarde).orElse(null);
        presonnel.setZone(zone);
        personnelRepo.save(presonnel);
    }

    /*@GetMapping("/getAllPersonnelZone")
    List<Personnel> getAllPersonnelByParking(Parking parking)
    {

        return  personnelRepo.findZoneIdZoneParkingIdParking();
    }*/

    @GetMapping("/nbGardeJour/{poste}")
    public Integer nombreGardeJour(@PathVariable Poste poste ) {

        return	personnelRepo.countByPoste(poste);
    }

    /*
    @GetMapping("/getPersonnelByDate/{startDate}/{endDate}")
    public List<Personnel>  getPersonalByDate(
            @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
            @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate
    )
             {

                 List<Personnel> personnels = personnelRepo.findAll();
                 float somme2 = 0;
                 for (Formation formation : formations) {
                     if(formation.getDateDebut().after(dateDebut)  && formation.getDateFin().before(dateFin)) {
                         somme2 += formation.getNbrHeures() * formation.getFormateur().getTarifHoraire();
                     }
                 }
                 return somme1;
    }
*/

    @GetMapping("/getNbGardesByZone/{zoneId}")
    public void getNbrGardesByZone(@PathVariable Zone zoneId ) {

        	personnelRepo.findByZone_Id(zoneId);
    }


}
