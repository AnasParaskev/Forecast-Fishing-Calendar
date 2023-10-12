package com.AnastasiosParaskevopoulos.ForecastFishingCalendar.repository;

import com.AnastasiosParaskevopoulos.ForecastFishingCalendar.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}