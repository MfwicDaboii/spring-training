package com.topdogs.training.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Province")
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    /*
    *   Wat doet "cascadeType" en welke zijn er?
    * */
    @OneToMany(mappedBy = "province", cascade = CascadeType.ALL)
    Set<Commune> communues;
}
