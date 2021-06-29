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
    private FirefighterService firefighterService;

    @Autowired
    private DeviceService deviceService;

    @Autowired
    private ScbaService scbaService;

    @Autowired
    private EmergencyService emergencyService;

    @Override
    public List<FireExtinctionOperation> getAllFireExtinctionOperations() {
        return fireExtinctionOperationRepository.findAll();
    }

    @Override
    public FireExtinctionOperation addFireExtictionOperation(FireExtinctionOperationCreationDTO fireExtinctionOperation) {
        Firefighter firstFirefighter;
        Firefighter secondFirefighter;

        FirefighterEquipment firstFirefighterEquipment = new FirefighterEquipment();
        FirefighterEquipment secondFirefighterEquipment = new FirefighterEquipment();

        FirefighterEquipment firstFirefighterEquipmentSaved;
        FirefighterEquipment secondFirefighterEquipmentSaved;

        Device firstDevice;
        Device secondDevice;

        Scba firstScba;
        Scba secondScba;

        Emergency emergency;

        try{
            //VALIDAR QUE LOS DATOS DE DEVICE, SCBA Y FIREFIGHTER NO SE REPITEN
            firstFirefighter = firefighterService.findById(fireExtinctionOperation.getFirstFirefighterId());
            secondFirefighter = firefighterService.findById(fireExtinctionOperation.getSecondFirefighterId());

            firstDevice = deviceService.findById(fireExtinctionOperation.getFirstDeviceId());
            secondDevice = deviceService.findById(fireExtinctionOperation.getSecondDeviceId());

            firstScba = scbaService.findById(fireExtinctionOperation.getFirstScbaId());
            secondScba = scbaService.findById(fireExtinctionOperation.getSecondScbaId());

            firstFirefighterEquipment.setDevice(firstDevice);
            firstFirefighterEquipment.setScba(firstScba);
            firstFirefighterEquipment.setFirefighter(firstFirefighter);

            secondFirefighterEquipment.setDevice(secondDevice);
            secondFirefighterEquipment.setScba(secondScba);
            secondFirefighterEquipment.setFirefighter(secondFirefighter);

            firstFirefighterEquipmentSaved = firefighterEquipmentService.addFireFighterEquiment(firstFirefighterEquipment);
            secondFirefighterEquipmentSaved = firefighterEquipmentService.addFireFighterEquiment(secondFirefighterEquipment);

            emergency = emergencyService.findById(fireExtinctionOperation.getEmergencyId());

        } catch(Exception e){
            throw e;
        }

        return null;


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


}
