package com.vinicius.challengeamedigital.planets.DTOs;

import com.vinicius.challengeamedigital.planets.domain.Planet_model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlanetResponseDTO {

    String id;

    String name;

    String climate;

    String ground;


    public static List<PlanetResponseDTO> fromPlanetModels(List<Planet_model> planets) {
        List<PlanetResponseDTO> planetResponseDTOs = new ArrayList<>();
        for (Planet_model planet : planets) {
            PlanetResponseDTO dto = new PlanetResponseDTO();
            dto.setId(planet.getId());
            dto.setName(planet.getName());
            dto.setClimate(planet.getClimate());
            dto.setGround(planet.getGround());
            planetResponseDTOs.add(dto);
        }
        return planetResponseDTOs;
    }
}
