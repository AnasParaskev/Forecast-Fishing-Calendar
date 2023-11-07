package com.AnastasiosParaskevopoulos.ForecastFishingCalendar.controller;

import com.AnastasiosParaskevopoulos.ForecastFishingCalendar.entity.Conditions;
import com.AnastasiosParaskevopoulos.ForecastFishingCalendar.service.ConditionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ConditionsController {

    private ConditionsService conditionsService;


//    @GetMapping(value="/conditions")
//    public Conditions getConditions() {
//
//        return conditionsService.getDailyConditions();
//    }
}
