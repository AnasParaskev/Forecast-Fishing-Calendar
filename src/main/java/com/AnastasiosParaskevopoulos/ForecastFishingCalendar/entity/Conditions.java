package com.AnastasiosParaskevopoulos.ForecastFishingCalendar.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;

@Entity
@Data
public class Conditions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String moonPhase;
    private String wind;
    private double temperature;
    private int barometricPressure;
    private double seaTemperature;
    private Time moonRise;
    private Time sunRise;
    private Time moonZenith;
    private Time sunZenith;
    private float highTide;
    private float lowTide;

    @OneToOne
    @JoinColumn(name = "calendar_id")
    private Calendar calendar;

}