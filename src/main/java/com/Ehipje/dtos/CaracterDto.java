package com.Ehipje.dtos;

import java.util.UUID;

public record CaracterDto(String name, int hp, int strength, int magic, UUID equipament, UUID skill, UUID item) {

}
