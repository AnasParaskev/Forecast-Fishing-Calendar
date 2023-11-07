package com.AnastasiosParaskevopoulos.ForecastFishingCalendar.service;

import com.AnastasiosParaskevopoulos.ForecastFishingCalendar.entity.User;
import com.AnastasiosParaskevopoulos.ForecastFishingCalendar.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}