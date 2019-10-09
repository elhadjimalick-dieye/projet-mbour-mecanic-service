package com.commerce.mbour.controller;

import com.commerce.mbour.model.Boutique;
import com.commerce.mbour.repository.BoutiqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/boutique")
public class BoutiqueController {

    @Autowired
    private BoutiqueRepository boutiqueRepository;
    @GetMapping(value = "/liste")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Boutique> liste(){
        return boutiqueRepository.findAll();
    }


    @PostMapping(value = "/add",consumes = {MediaType.APPLICATION_JSON_VALUE})
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Boutique add(@RequestBody(required = false) Boutique boutique){

        return boutiqueRepository.save(boutique);
    }


}
