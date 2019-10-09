package com.commerce.mbour.repository;

import com.commerce.mbour.model.Boutique;
import com.commerce.mbour.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface BoutiqueRepository extends JpaRepository<Boutique, Long> {

}