package com.api.safetech.appointmentservice.appointment.domain.model.entity;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class Appliance {
    private Long id;
    private String name;
    private  Float cost;
}
