package com.contact.model;

import java.io.Serializable;

import lombok.Data;

/**
* This class is used to bind form data.
*
* @author  Aftab alam
* @version 1.0
* @since   Dec22-2019 
*/

@Data
public class Contact implements Serializable {

	private Integer contactId;
	private String contactName;
	private String contactEmail;
	private Long phNo;
}
