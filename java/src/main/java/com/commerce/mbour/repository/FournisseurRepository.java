package com.commerce.mbour.repository;

import com.commerce.mbour.model.Fournisseur;
import com.commerce.mbour.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur, Long> {

}