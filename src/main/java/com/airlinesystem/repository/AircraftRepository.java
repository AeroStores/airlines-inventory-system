package com.airlinesystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airlinesystem.entity.Aircraft;

/**
 * Repository interface for Aircraft entity.
 */
@Repository
public interface AircraftRepository extends JpaRepository<Aircraft, Long> {

    Optional<Aircraft> findByRegistrationNumber(String registrationNumber);

    java.util.List<Aircraft> findByStatus(String status);

    java.util.List<Aircraft> findByManufacturer(String manufacturer);

}
