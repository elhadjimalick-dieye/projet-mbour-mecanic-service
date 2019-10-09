package com.commerce.mbour.repository;

import com.commerce.mbour.model.User;
import com.commerce.mbour.model.Vente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface VenteRepository extends JpaRepository<Vente, Long> {

}