package com.AnastasiosParaskevopoulos.ForecastFishingCalendar.repository;

import com.AnastasiosParaskevopoulos.ForecastFishingCalendar.entity.Conditions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConditionsRepository extends JpaRepository<Conditions, Long> {


}
