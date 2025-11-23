package com.topdogs.training.model;

import jakarta.persistence.*;

@Entity
@Table(name = "NeighborhoodDistrict")
public class NeighborhoodDistrict {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "cityOrVillageId")
    private CityOrVillage cityOrVillage;

    public NeighborhoodDistrict() {}
}
