package com.api.safetech.appointmentservice.appointment.resource;

import com.api.safetech.appointmentservice.appointment.domain.model.entity.Status;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AppointmentResource {
    private Long id;
    private String problemDescription;
    private Date scheduledAt;
    private String address;
    private Status status;
    private Integer userId;
    private Integer technicalId;
    private Integer applianceId;
}
