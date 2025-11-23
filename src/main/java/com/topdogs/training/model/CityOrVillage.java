package com.topdogs.training.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "CityOrVillage")
public class CityOrVillage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "communeId")
    private Commune commune;

    @OneToMany(mappedBy = "cityOrVillage", cascade = CascadeType.ALL)
    public Set<NeighborhoodDistrict> neighborhoodDistricts;
}
