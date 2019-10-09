package com.commerce.mbour.repository;

import com.commerce.mbour.model.Typeproduit;
import com.commerce.mbour.model.Vente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TypeprodiutRepository extends JpaRepository<Typeproduit, Long> {

}