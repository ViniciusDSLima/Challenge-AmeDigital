package com.vinicius.challengeamedigital.planets.repositories;

import com.vinicius.challengeamedigital.planets.domain.Planet_model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetRepository extends JpaRepository<Planet_model, String> {
}
