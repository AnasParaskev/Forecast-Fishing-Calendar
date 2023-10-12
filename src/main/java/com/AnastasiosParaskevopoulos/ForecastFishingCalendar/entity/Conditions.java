package com.AnastasiosParaskevopoulos.ForecastFishingCalendar.entity;

import jakarta.persistence.*;

import java.sql.Time;

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
    private Time moonRise;
    private Time sunRise;
    private Time moonZenith;
    private Time sunZenith;
    private String tides;

    @OneToOne
    @JoinColumn(name = "calendar_id")
    private Calendar calendar;

}
