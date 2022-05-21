package com.leonrv.advicesleonrv.controller;

import java.util.List;

import com.leonrv.advicesleonrv.domain.Slip;
import com.leonrv.advicesleonrv.service.ISlipService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/advice")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH })
public class SlipController {
    
    @Autowired
    ISlipService slipService;


    @GetMapping
    public List<Slip> findAll(){
        return slipService.listSlips();
    }

    @PostMapping
    public void save(@RequestBody Slip slip){
        slipService.save(slip);
    }

    @DeleteMapping
    public void delete(@RequestBody Slip slip){
        slipService.delete(slip);
    }

    @GetMapping("/{id}")
    public Slip findById(@PathVariable Long id){
        return slipService.getById(id);
    }

}
