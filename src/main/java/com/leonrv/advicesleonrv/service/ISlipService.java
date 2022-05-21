package com.leonrv.advicesleonrv.service;

import java.util.List;

import com.leonrv.advicesleonrv.domain.Slip;

public interface ISlipService {
    
    List<Slip> listSlips();
    void save(Slip slip);
    Slip getById(Long id);
    void delete(Slip slip);

}
