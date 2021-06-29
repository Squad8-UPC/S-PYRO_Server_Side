package com.squad8.spyro.service;

import com.squad8.spyro.entity.Device;

import java.util.List;

public interface DeviceService {

    public List<Device> getAllDevices();

    public Device addDevice(Device device);

    public Device findById(String deviceId);

}
