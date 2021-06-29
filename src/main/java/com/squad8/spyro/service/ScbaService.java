package com.squad8.spyro.service;

import com.squad8.spyro.entity.Scba;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ScbaService {


    public List<Scba> getAllScba();

    public Scba addScba(Scba scba);

    public Scba findById(String scbaId);
}
