package com.vehicle.tutorial;

import com.vehicle.tutorial.vehicles.VehiclesController;
import com.vehicle.tutorial.vehicles.VehiclesRepository;
import com.vehicle.tutorial.vehicles.VehiclesService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses={VehiclesController.class, VehiclesRepository.class, VehiclesService.class})
public class TutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialApplication.class, args);
	}

}
