package com.AnastasiosParaskevopoulos.ForecastFishingCalendar.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.context.annotation.Primary;

import java.util.Set;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String name;
    private String surname;
    private String email;
    private String password;
    @OneToMany(mappedBy = "user")
    private Set<Calendar> calendars;
}