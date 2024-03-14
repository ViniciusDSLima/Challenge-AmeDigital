package com.vinicius.challengeamedigital.planets.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "planet")
@Getter
@Setter
public class Planet_model {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private String climate;

    private String ground;
}
