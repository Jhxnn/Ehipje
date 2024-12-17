package com.Ehipje.dtos;

import java.util.UUID;

import com.Ehipje.models.enums.BattleStatus;

public record BattleDto(UUID caracter1, UUID caracter2, BattleStatus batleStatus) {

}
