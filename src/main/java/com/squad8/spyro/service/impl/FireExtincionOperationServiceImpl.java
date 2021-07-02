package com.squad8.spyro.service.impl;

import com.squad8.spyro.dto.request.FireExtinctionOperationCreationDTO;
import com.squad8.spyro.dto.request.FireExtinctionOperationEndDTO;
import com.squad8.spyro.entity.*;
import com.squad8.spyro.repository.FireExtinctionOperationRepository;
import com.squad8.spyro.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@Service
public class FireExtincionOperationServiceImpl implements FireExtinctionOperationService {

    @Autowired
    private FireExtinctionOperationRepository fireExtinctionOperationRepository;

    @Autowired
    private FirefighterEquipmentService firefighterEquipmentService;

    @Autowired
    private EmergencyService emergencyService;

    @Override
    public List<FireExtinctionOperation> getAllFireExtinctionOperations() {
        return fireExtinctionOperationRepository.findAll();
    }

    //TODO: CAMBIAR A BUSQUEDA POR NÚMERO SERIAL, CÓDIGO DE SCBA Y CÓDIGO DE BOMBERO, NO ID'S
    @Override
    public FireExtinctionOperation addFireExtinctionOperation(FireExtinctionOperationCreationDTO fireExtinctionOperationRequest) {

        FirefighterEquipment firstFirefighterEquipment;
        FirefighterEquipment secondFirefighterEquipment;

        Emergency emergency;

        FireExtinctionOperation fireExtinctionOperation = new FireExtinctionOperation();
        FireExtinctionOperation fireExtinctionOperationSaved;

        try{

            firstFirefighterEquipment = firefighterEquipmentService.findOrCreateByScbaIdAndDeviceIdAndFirefighterId(
                    fireExtinctionOperationRequest.getFirstScbaId(),
                    fireExtinctionOperationRequest.getFirstDeviceId(),
                    fireExtinctionOperationRequest.getFirstFirefighterId()
            );
            secondFirefighterEquipment = firefighterEquipmentService.findOrCreateByScbaIdAndDeviceIdAndFirefighterId(
                    fireExtinctionOperationRequest.getSecondScbaId(),
                    fireExtinctionOperationRequest.getSecondDeviceId(),
                    fireExtinctionOperationRequest.getSecondFirefighterId()
            );

            emergency = emergencyService.findById(fireExtinctionOperationRequest.getEmergencyId());
            Date entryTime = fireExtinctionOperationRequest.getEntryTime();

            fireExtinctionOperation.setEmergency(emergency);
            fireExtinctionOperation.setFirefighterEquipment1(firstFirefighterEquipment);
            fireExtinctionOperation.setFirefighterEquipment2(secondFirefighterEquipment);
            fireExtinctionOperation.setEntryTime(entryTime);
            fireExtinctionOperationSaved = fireExtinctionOperationRepository.save(fireExtinctionOperation);

        } catch(Exception e){
            throw e;
        }

        return fireExtinctionOperationSaved;


    }

    @Transactional
    @Override
    public int endFireExtinctionOperation(FireExtinctionOperationEndDTO request) {
        int actualizado = 0;
        try{
            final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            format.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date endTime = format.parse(request.getEndTime());
            actualizado = fireExtinctionOperationRepository.updateFireExtinctionOperationEndTimeByEmergencyId(endTime, request.getFireExtinctionOperationId());

        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        return actualizado;

    }

    @Override
    public List<FireExtinctionOperation> findByEmergencyId(String emergencyId) {
        return fireExtinctionOperationRepository.findByEmergencyId(emergencyId);
    }


}
