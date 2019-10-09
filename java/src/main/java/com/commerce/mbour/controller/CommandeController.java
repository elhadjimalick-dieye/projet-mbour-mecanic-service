package com.commerce.mbour.controller;

import com.commerce.mbour.model.Commande;
import com.commerce.mbour.model.Produits;
import com.commerce.mbour.model.Typeproduit;
import com.commerce.mbour.repository.CommandeRepository;
import com.commerce.mbour.repository.TypeprodiutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/commande")
public class CommandeController {

    @Autowired
    private CommandeRepository commandeRepository;

    @GetMapping(value = "/liste")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Commande> liste(){
        return commandeRepository.findAll();
    }


    @PostMapping(value = "/add",consumes = {MediaType.APPLICATION_JSON_VALUE})
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Commande add(@RequestBody(required = false) Commande commande){
        commande.setNombreproduit(commande.getNombreproduit());
        Produits produits = new Produits();
        produits.getPrix();
        commande.setMontant(produits.getPrix()*commande.getNombreproduit());
        commande.setStatut("non livrait");
        commande.setDate(new Date());
        return commandeRepository.save(commande);
    }


}
