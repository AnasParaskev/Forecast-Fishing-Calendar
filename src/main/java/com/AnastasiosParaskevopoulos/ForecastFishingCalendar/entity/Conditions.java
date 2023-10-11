package com.AnastasiosParaskevopoulos.ForecastFishingCalendar.entity;

import jakarta.persistence.*;

@Entity
public class Conditions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String moonPhase;
    private String wind;
    private double temperature;
    private double barometricPressure;
    private double seaTemperature;
    private String moonRise;
    private String sunRise;
    private String moonZenith;
    private String sunZenith;
    private String tides;

    @OneToOne
    @JoinColumn(name = "calendar_id")
    private Calendar calendar;

}
