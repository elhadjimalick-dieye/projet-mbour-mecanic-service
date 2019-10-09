package com.commerce.mbour.controller;

import com.commerce.mbour.model.Boutique;
import com.commerce.mbour.model.Typeproduit;
import com.commerce.mbour.repository.BoutiqueRepository;
import com.commerce.mbour.repository.TypeprodiutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/typeproduit")
public class TypeproduitController {

    @Autowired
    private TypeprodiutRepository typeprodiutRepository;
    @GetMapping(value = "/liste")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Typeproduit> liste(){
        return typeprodiutRepository.findAll();
    }


    @PostMapping(value = "/add",consumes = {MediaType.APPLICATION_JSON_VALUE})
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Typeproduit add(@RequestBody(required = false) Typeproduit typeproduit){

        return typeprodiutRepository.save(typeproduit);
    }


}
