package com.AnastasiosParaskevopoulos.ForecastFishingCalendar.repository;

import com.AnastasiosParaskevopoulos.ForecastFishingCalendar.entity.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarRepository extends JpaRepository<Calendar, Long> {

}
