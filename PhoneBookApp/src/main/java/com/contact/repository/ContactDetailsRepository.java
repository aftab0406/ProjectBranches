package com.contact.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contact.entity.ContactDetailsEntity;

/**
 * This Interface will perform CURD operation on DB table
 * 
 * @author  Aftab alam
 * @version 1.0
 * @since   Dec22-2019 
 */

public interface ContactDetailsRepository extends JpaRepository<ContactDetailsEntity, Serializable> {

}
