package br.com.baozistore.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

public record ClienteRequest(
    @NotBlank String nome,
    @NotNull LocalDate clienteDesde
) {}
