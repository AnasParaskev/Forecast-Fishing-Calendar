package com.AnastasiosParaskevopoulos.ForecastFishingCalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.AnastasiosParaskevopoulos.ForecastFishingCalendar.repository")
@EntityScan(basePackages = "com.AnastasiosParaskevopoulos.ForecastFishingCalendar.entity")
public class ForecastFishingCalendarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForecastFishingCalendarApplication.class, args);
	}

}
