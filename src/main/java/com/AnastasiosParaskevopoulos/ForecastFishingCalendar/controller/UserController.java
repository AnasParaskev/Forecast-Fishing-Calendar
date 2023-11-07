package com.AnastasiosParaskevopoulos.ForecastFishingCalendar.controller;

import com.AnastasiosParaskevopoulos.ForecastFishingCalendar.entity.Conditions;
import com.AnastasiosParaskevopoulos.ForecastFishingCalendar.entity.User;
import com.AnastasiosParaskevopoulos.ForecastFishingCalendar.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(value="/users")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

}