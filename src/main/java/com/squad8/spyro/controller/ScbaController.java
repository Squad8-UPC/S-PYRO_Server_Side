package com.squad8.spyro.controller;

import com.squad8.spyro.entity.Emergency;
import com.squad8.spyro.entity.Scba;
import com.squad8.spyro.service.EmergencyService;
import com.squad8.spyro.service.ScbaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/scba/")
public class ScbaController {

    @Autowired
    ScbaService scbaService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("")
    public List<Scba> getScba(){
        return scbaService.getAllScba();
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("")
    public Scba addScba(@RequestBody Scba scba){
        return scbaService.addScba(scba);
    }

}
