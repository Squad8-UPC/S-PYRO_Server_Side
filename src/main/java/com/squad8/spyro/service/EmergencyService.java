package com.squad8.spyro.service;

import com.squad8.spyro.dto.request.EmergencyCreationDTO;
import com.squad8.spyro.entity.Emergency;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmergencyService {

    public List<Emergency> getAllEmergencies();

    public Emergency addEmergency(EmergencyCreationDTO emergency);

    public Emergency findById(String emergencyId);
}
