package com.topdogs.training.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Commune")
public class Commune {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    /*
    *       Wat doet JoinColumn?
    *       Welke opties zijn er voor ManyToOne?
    * */
    @ManyToOne
    @JoinColumn(name = "provinceId")
    private Province province;

    @OneToMany(mappedBy = "commune", cascade = CascadeType.ALL)
    private Set<CityOrVillage> cities;
}
