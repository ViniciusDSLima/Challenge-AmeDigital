package com.vinicius.challengeamedigital.planets.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(of = "id")
public class Planet_entity {
    private String id;

    private String name;

    private String climate;

    private String ground;
}
