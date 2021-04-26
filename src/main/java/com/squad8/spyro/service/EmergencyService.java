package com.squad8.spyro.service;

import com.squad8.spyro.entity.Emergency;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmergencyService {

    public List<Emergency> getAllEmergencies();

}
