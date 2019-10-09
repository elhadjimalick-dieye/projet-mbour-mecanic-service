package com.commerce.mbour.controller;

import com.commerce.mbour.model.Fournisseur;
import com.commerce.mbour.repository.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/fournisseur")
public class FournisseurController {

    @Autowired
    private FournisseurRepository fournisseurRepository;
    @GetMapping(value = "/liste")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Fournisseur> liste(){
        return fournisseurRepository.findAll();
    }


    @PostMapping(value = "/add",consumes = {MediaType.APPLICATION_JSON_VALUE})
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Fournisseur add(@RequestBody(required = false) Fournisseur fournisseur){

        return fournisseurRepository.save(fournisseur);
    }


}
