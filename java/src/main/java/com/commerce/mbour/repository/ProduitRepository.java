package com.commerce.mbour.repository;

import com.commerce.mbour.model.Produits;
import com.commerce.mbour.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ProduitRepository extends JpaRepository<Produits, Long> {

}