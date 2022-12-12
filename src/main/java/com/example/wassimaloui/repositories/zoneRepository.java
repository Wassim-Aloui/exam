package com.example.wassimaloui.repositories;

import com.example.wassimaloui.entities.Zone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface zoneRepository extends JpaRepository<Zone,Integer> {
}
