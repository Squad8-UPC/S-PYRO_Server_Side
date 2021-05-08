package com.squad8.spyro.service.impl;

import com.squad8.spyro.entity.Firefighter;
import com.squad8.spyro.repository.FirefighterRepository;
import com.squad8.spyro.service.FirefighterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FirefighterServiceImpl implements FirefighterService {

    @Autowired
    FirefighterRepository firefighterRepository;

    @Override
    public List<Firefighter> getAllFirefighters() {
        return firefighterRepository.findAll();
    }

    @Override
    public Firefighter addFirefighter(Firefighter firefighter) {
        return firefighterRepository.save(firefighter);
    }
}
