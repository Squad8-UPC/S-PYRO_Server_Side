package com.squad8.spyro.controller;

import com.squad8.spyro.entity.Device;
import com.squad8.spyro.entity.Emergency;
import com.squad8.spyro.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/device/")
public class DeviceController {

    @Autowired
    DeviceService deviceService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("")
    public List<Device> getDevice(){
        return deviceService.getAllDevices();
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("")
    public Device addDevice(@RequestBody Device device){
        return deviceService.addDevice(device);
    }


}
