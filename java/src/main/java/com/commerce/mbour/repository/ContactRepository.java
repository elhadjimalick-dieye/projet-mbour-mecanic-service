package com.commerce.mbour.repository;

import com.commerce.mbour.model.Contact;
import com.commerce.mbour.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}