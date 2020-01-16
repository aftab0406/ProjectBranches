package com.contact.service;

import java.util.List;

import com.contact.entity.ContactDetailsEntity;
import com.contact.model.Contact;

/**
* This interface is holds various methods 
*
* @author  Aftab alam
* @version 1.0
* @since   Dec22-2019 
*/
public interface ContactService {

	public String saveContact(ContactDetailsEntity entity);
	
	public String editContact(ContactDetailsEntity entity);
	
	public Contact findContactById(Integer cid);
	
	public String deleteContact(ContactDetailsEntity entity);
	
	public List<Contact> findAllContact();
}
