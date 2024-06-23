package com.vehicle.tutorial.vehicles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VehiclesService {
    @Autowired
    private VehiclesRepository vehiclesRepository;

    public List<Vehicles> getAllVehicles() {
        return vehiclesRepository.findAll();
    }
}