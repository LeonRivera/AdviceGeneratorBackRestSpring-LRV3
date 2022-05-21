package com.leonrv.advicesleonrv.service;

import java.util.List;

import com.leonrv.advicesleonrv.domain.Slip;
import com.leonrv.advicesleonrv.repository.SlipRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class SlipServiceImpl implements ISlipService{

    @Autowired
    SlipRepository slipRepository;

    @Override
    public List<Slip> listSlips() {
        return (List<Slip>) slipRepository.findAll();
    }

    @Override
    public void save(Slip slip) {
        slipRepository.save(slip);
    }

    @Override
    public Slip getById(Long id) {
        return slipRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Slip slip) {
        slipRepository.delete(slip);
    }

    
}
