package com.AnastasiosParaskevopoulos.ForecastFishingCalendar.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Calendar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private String location;
    private String catchDescription;
    private String lureType;

    @OneToOne(mappedBy = "calendar")
    private Conditions conditions;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
