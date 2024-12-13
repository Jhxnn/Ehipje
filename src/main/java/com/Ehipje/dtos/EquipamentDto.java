package com.Ehipje.dtos;

import com.Ehipje.models.enums.EquipamentType;

public record EquipamentDto(String name, EquipamentType type, int equipamentStatus) {

}
