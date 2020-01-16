package com.contact.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/**
* This class is used for Mapping with DB table.
*
* @author  Aftab alam
* @version 1.0
* @since   Dec22-2019 
*/

@Data
public class ContactDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer contactId;
	private String contactName;
	private String contactEmail;
	private Long phNo;
}
