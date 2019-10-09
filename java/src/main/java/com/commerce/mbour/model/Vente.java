package com.commerce.mbour.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Vente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 30)
    private String produit;
    @Column(length = 30)
    private Date date;
    @Column(length = 30)
    private int prix;
    @Column(length = 30)
    private String statut;
    @Column(length = 30)
    private int nombreproduit;
    //@JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Produits produits;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduit() {
        return produit;
    }

    public void setProduuit(String produit) {
        this.produit = produit;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public void setProduit(String produit) {
        this.produit = produit;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Produits getProduits() {
        return produits;
    }

    public void setProduits(Produits produits) {
        this.produits = produits;
    }

    public int getNombreproduit() {
        return nombreproduit;
    }

    public void setNombreproduit(int nombreproduit) {
        this.nombreproduit = nombreproduit;
    }
}
