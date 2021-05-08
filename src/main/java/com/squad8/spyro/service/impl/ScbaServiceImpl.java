package com.squad8.spyro.service.impl;

import com.squad8.spyro.entity.Scba;
import com.squad8.spyro.repository.ScbaRepository;
import com.squad8.spyro.service.ScbaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScbaServiceImpl implements ScbaService {

    @Autowired
    ScbaRepository scbaRepository;

    @Override
    public List<Scba> getAllScba() {
        return scbaRepository.findAll();
    }

    @Override
    public Scba addScba(Scba scba) {
        return scbaRepository.save(scba);
    }
}
