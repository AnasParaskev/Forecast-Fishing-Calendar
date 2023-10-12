package com.AnastasiosParaskevopoulos.ForecastFishingCalendar.service;

import com.AnastasiosParaskevopoulos.ForecastFishingCalendar.entity.Conditions;
import com.AnastasiosParaskevopoulos.ForecastFishingCalendar.repository.ConditionsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ConditionsService {

    private final ConditionsRepository conditionsRepository;

    public Conditions getDailyConditions() {
        return null;
    }

}