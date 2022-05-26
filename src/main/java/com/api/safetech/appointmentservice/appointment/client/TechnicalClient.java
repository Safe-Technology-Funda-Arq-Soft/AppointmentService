package com.api.safetech.appointmentservice.appointment.client;

import com.api.safetech.appointmentservice.appointment.domain.model.entity.Technical;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "technical-service", path = "/api/v1/technicals")
public interface TechnicalClient {

    @GetMapping("{technicalId}")
    public ResponseEntity<Technical> getById(@PathVariable Long technicalId);
}
