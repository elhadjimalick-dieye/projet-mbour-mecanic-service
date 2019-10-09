package com.commerce.mbour.model;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 30)
    private Date date;
    @Column(length = 30)
    private int nombreproduit;
    @Column(length = 30)
    private String statut;
    @Column(length = 30)
    private int montant;
    //@JsonBackReference
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "commande_produit",
            joinColumns = @JoinColumn(name = "commande_id"),
            inverseJoinColumns = @JoinColumn(name = "produit_id"))
    private Set<Produits> roles = new HashSet<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    @Nullable
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    @Nullable
    private Fournisseur fournisseur;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPrix() {
        return nombreproduit;
    }

    public void setPrix(int prix) {
        this.nombreproduit = prix;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Set<Produits> getRoles() {
        return roles;
    }

    public void setRoles(Set<Produits> roles) {
        this.roles = roles;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public int getNombreproduit() {
        return nombreproduit;
    }

    public void setNombreproduit(int nombreproduit) {
        this.nombreproduit = nombreproduit;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }
}
