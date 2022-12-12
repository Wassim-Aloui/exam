package com.example.wassimaloui.entities;

import com.sun.jdi.PrimitiveValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Parking implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String designation;
    private String adresse;
    private Integer capacite;

   @OneToMany(mappedBy = "parking")
    private Set<Zone> listZone;


}
