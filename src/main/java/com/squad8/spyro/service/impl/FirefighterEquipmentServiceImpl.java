package com.squad8.spyro.service.impl;

import com.squad8.spyro.entity.Device;
import com.squad8.spyro.entity.Firefighter;
import com.squad8.spyro.entity.FirefighterEquipment;
import com.squad8.spyro.entity.Scba;
import com.squad8.spyro.repository.FirefighterEquipmentRepository;
import com.squad8.spyro.service.DeviceService;
import com.squad8.spyro.service.FirefighterEquipmentService;
import com.squad8.spyro.service.FirefighterService;
import com.squad8.spyro.service.ScbaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirefighterEquipmentServiceImpl implements FirefighterEquipmentService {

    @Autowired
    FirefighterEquipmentRepository firefighterEquipmentRepository;

    @Autowired
    FirefighterService firefighterService;

    @Autowired
    DeviceService deviceService;

    @Autowired
    ScbaService scbaService;

    @Override
    public List<FirefighterEquipment> getAllFireFighterEquiments() {
        return firefighterEquipmentRepository.findAll();
    }

    @Override
    public FirefighterEquipment addFireFighterEquiment(FirefighterEquipment firefighterEquipment) {
        return firefighterEquipmentRepository.save(firefighterEquipment);
    }

    @Override
    public FirefighterEquipment findOrCreateByScbaIdAndDeviceIdAndFirefighterId(String scbaId, String deviceId, String firefighterId){
        List<FirefighterEquipment> equipments = firefighterEquipmentRepository.findByScbaIdAndDeviceIdAndFirefighterId(scbaId, deviceId, firefighterId);
        FirefighterEquipment firefighterEquipment = new FirefighterEquipment();
        FirefighterEquipment firefighterEquipmentResult;
        if(equipments.size() == 0){
            Firefighter firstFirefighter = firefighterService.findById(scbaId);
            Device firstDevice = deviceService.findById(deviceId);
            Scba firstScba = scbaService.findById(firefighterId);

            firefighterEquipment.setDevice(firstDevice);
            firefighterEquipment.setScba(firstScba);
            firefighterEquipment.setFirefighter(firstFirefighter);

            firefighterEquipmentResult = firefighterEquipmentRepository.save(firefighterEquipment);

        } else{
            firefighterEquipmentResult = equipments.get(0);
        }

        return firefighterEquipmentResult;



    }
}
