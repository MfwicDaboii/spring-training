package com.topdogs.training.model;

import com.topdogs.training.model.enumerations.RegionType;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class HeatMapData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double latitude;
    private double longitude;
    private LocalDateTime localDateTimeStamp;

    @Enumerated(EnumType.STRING)
    private RegionType regionType;

    private Long regionId;
}
