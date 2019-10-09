package com.commerce.mbour.controller;

import com.commerce.mbour.model.Produits;
import com.commerce.mbour.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/produit")
public class ProduitController {

    @Autowired
    private ProduitRepository produitRepository;
    @GetMapping(value = "/liste")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Produits> liste(){
        return produitRepository.findAll();
    }


    @PostMapping(value = "/add",consumes = {MediaType.APPLICATION_JSON_VALUE})
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Produits add(@RequestBody(required = false) Produits produits){

        return produitRepository.save(produits);
    }


}
