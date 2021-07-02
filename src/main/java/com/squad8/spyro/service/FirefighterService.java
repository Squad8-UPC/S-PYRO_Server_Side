package com.squad8.spyro.service;

import com.squad8.spyro.entity.Firefighter;

import java.util.List;

public interface FirefighterService {

    public List<Firefighter> getAllFirefighters();

    public Firefighter addFirefighter(Firefighter firefighter);

    public Firefighter findById(String firefighterId);
}
