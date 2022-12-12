package com.example.wassimaloui.entities;

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
public class Zone implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ref;
    private float dimension;

    @OneToMany
    private Set<Personnel>listPersonnel;

    @OneToOne(mappedBy = "zone")
    private Personnel garde;

    @ManyToOne
    private Parking parking;

}
