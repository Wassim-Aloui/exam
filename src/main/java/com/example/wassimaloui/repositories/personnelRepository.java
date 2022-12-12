package com.example.wassimaloui.repositories;

import com.example.wassimaloui.entities.Parking;
import com.example.wassimaloui.entities.Personnel;
import com.example.wassimaloui.entities.Poste;
import com.example.wassimaloui.entities.Zone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.util.Date;

@Repository
public interface personnelRepository extends JpaRepository<Personnel,Integer> {

    //public void findZoneIdZoneParkingIdParking(Zone IdZone, Parking IdParking);


    public Integer countByPoste(Poste poste);

    public void findByZone_Id(Zone Id);


}
