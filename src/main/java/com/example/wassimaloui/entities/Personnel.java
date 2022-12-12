package com.example.wassimaloui.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Personnel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String prenom;
    private Integer age;

    @Temporal(TemporalType.DATE)
    private Date dateRecrutement;
    private String login;
    private String password;
    @Enumerated(EnumType.STRING)
    private Poste poste;

    @OneToOne
    private Zone zone;
}
