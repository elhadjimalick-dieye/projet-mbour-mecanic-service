package com.commerce.mbour.controller;

import com.commerce.mbour.model.Boutique;
import com.commerce.mbour.model.Employe;
import com.commerce.mbour.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/employe")
public class EmployeController {
    @Autowired
    private EmployeRepository employeRepository;
    @GetMapping(value = "/liste")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Employe> liste(){
        return employeRepository.findAll();
    }

    @PostMapping(value = "/add",consumes = {MediaType.APPLICATION_JSON_VALUE})
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Employe add(@RequestBody(required = false) Employe employe){

        return employeRepository.save(employe);
    }


}
