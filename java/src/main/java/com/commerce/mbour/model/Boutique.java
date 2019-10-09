package com.commerce.mbour.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Boutique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 30)
    private String adresse;
    @Column(length = 30)
    private int stock;
    @Column(length = 30)
    private int fond;
    @OneToMany(mappedBy ="boutique")
    //@JsonBackReference
    private List <Employe> employes;

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getFond() {
        return fond;
    }

    public void setFond(int fond) {
        this.fond = fond;
    }
}
