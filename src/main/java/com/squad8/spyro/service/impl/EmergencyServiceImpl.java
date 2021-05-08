package com.squad8.spyro.service.impl;

import com.squad8.spyro.entity.Emergency;
import com.squad8.spyro.repository.EmergencyRepository;
import com.squad8.spyro.service.EmergencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmergencyServiceImpl implements EmergencyService {

    @Autowired
    EmergencyRepository emergencyRepository;

    @Override
    public List<Emergency> getAllEmergencies() {
        return emergencyRepository.findAll();
    }

    @Override
    public Emergency addEmergency(Emergency emergency) {
        return emergencyRepository.save(emergency);
    }
}
