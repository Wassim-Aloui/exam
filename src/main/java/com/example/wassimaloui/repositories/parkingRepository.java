package com.example.wassimaloui.repositories;

import com.example.wassimaloui.entities.Parking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface parkingRepository extends JpaRepository<Parking, Integer> {
}
