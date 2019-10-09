package com.commerce.mbour.repository;

import com.commerce.mbour.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AchatRepository extends JpaRepository<User, Long> {

}