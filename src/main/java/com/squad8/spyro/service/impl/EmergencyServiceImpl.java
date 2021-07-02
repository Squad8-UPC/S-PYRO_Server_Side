package com.squad8.spyro.service.impl;

import com.squad8.spyro.dto.request.EmergencyCreationDTO;
import com.squad8.spyro.entity.Emergency;
import com.squad8.spyro.repository.EmergencyRepository;
import com.squad8.spyro.service.EmergencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.List;


@Service
public class EmergencyServiceImpl implements EmergencyService {

    @Autowired
    EmergencyRepository emergencyRepository;

    public static final ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<Emergency> getAllEmergencies() {
        return emergencyRepository.findAll();
    }

    @Override
    public Emergency addEmergency(EmergencyCreationDTO emergency) {
        Emergency newEmergency;
        Emergency emergencyEntity;
        //modelMapper.map(getRestaurantEntity(restaurantEntity.getId()),RestaurantRest.class);
        try{
            newEmergency = modelMapper.map(emergency, Emergency.class);
            /*newEmergency.setPartNumber(emergency.getPartNumber());
            newEmergency.setAddress(emergency.getAddress());
            newEmergency.setDate(emergency.getDate());
            newEmergency.setReportedTime(emergency.getReportedTime());
            newEmergency.setState(emergency.getState());*/
            emergencyEntity = emergencyRepository.save(newEmergency);

        } catch(Exception e){
            throw e;
        }
        return emergencyEntity;
    }

    @Override
    public Emergency findById(String emergencyId){
        return emergencyRepository.findById(emergencyId).get();
    }
}
