package com.vehicle.tutorial.vehicles;

import com.vehicle.tutorial.vehicles.Vehicles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VehiclesRepository extends JpaRepository<Vehicles, UUID> {


}
