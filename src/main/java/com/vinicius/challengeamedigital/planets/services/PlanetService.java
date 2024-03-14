package com.vinicius.challengeamedigital.planets.services;

import com.vinicius.challengeamedigital.planets.DTOs.PlanetResponseDTO;
import com.vinicius.challengeamedigital.planets.domain.Planet_model;
import com.vinicius.challengeamedigital.planets.repositories.PlanetRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class PlanetService {

    private PlanetRepository planetRepository;

    public List<PlanetResponseDTO> getAllPlanet() {
        List<Planet_model> planet = this.planetRepository.findAll();

        return PlanetResponseDTO.fromPlanetModels(planet);
    }

}
