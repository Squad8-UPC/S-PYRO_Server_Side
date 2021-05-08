package com.squad8.spyro.service.impl;

import com.squad8.spyro.entity.Device;
import com.squad8.spyro.repository.DeviceRepository;
import com.squad8.spyro.repository.EmergencyRepository;
import com.squad8.spyro.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {


    @Autowired
    DeviceRepository deviceRepository;

    @Override
    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }

    @Override
    public Device addDevice(Device device) {
        return deviceRepository.save(device);
    }
}
