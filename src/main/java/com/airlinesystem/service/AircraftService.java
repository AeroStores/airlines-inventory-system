package com.airlinesystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.airlinesystem.entity.Aircraft;
import com.airlinesystem.repository.AircraftRepository;

import lombok.RequiredArgsConstructor;

/**
 * Service class for Aircraft operations.
 */
@Service
@RequiredArgsConstructor
public class AircraftService {

    private final AircraftRepository aircraftRepository;

    /**
     * Retrieve all aircraft.
     */
    public List<Aircraft> getAllAircraft() {
        return aircraftRepository.findAll();
    }

    /**
     * Retrieve aircraft by ID.
     */
    public Optional<Aircraft> getAircraftById(Long id) {
        return aircraftRepository.findById(id);
    }

    /**
     * Create a new aircraft.
     */
    public Aircraft createAircraft(Aircraft aircraft) {
        return aircraftRepository.save(aircraft);
    }

    /**
     * Update an existing aircraft.
     */
    public Aircraft updateAircraft(Long id, Aircraft aircraftDetails) {
        return aircraftRepository.findById(id).map(aircraft -> {
            aircraft.setModel(aircraftDetails.getModel());
            aircraft.setStatus(aircraftDetails.getStatus());
            aircraft.setCapacity(aircraftDetails.getCapacity());
            aircraft.setLastMaintenanceDate(aircraftDetails.getLastMaintenanceDate());
            return aircraftRepository.save(aircraft);
        }).orElseThrow(() -> new RuntimeException("Aircraft not found"));
    }

    /**
     * Delete an aircraft.
     */
    public void deleteAircraft(Long id) {
        aircraftRepository.deleteById(id);
    }

    /**
     * Find aircraft by status.
     */
    public List<Aircraft> getAircraftByStatus(String status) {
        return aircraftRepository.findByStatus(status);
    }

}
