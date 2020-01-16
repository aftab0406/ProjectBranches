package com.contact.controller;

import org.springframework.ui.Model;

import com.contact.model.Contact;

/**
* This controller class is used to hadel request comming from
* contact info page.
*
* @author  Aftab alam
* @version 1.0
* @since   Dec22-2019 
*/

public class ContactInfoController {

	/**
	* This method is used for load and display the contact info page.  
	*/
	public String displayContactForm(Model model) {
		
		return null;
	}
	
	/**
	* This method is used for save contact in DB table.  
	*/
	public String handelSubmitBtn(Contact contact,Model model) {
		
		return null;
	}
	
	/**
	* This method is used to show all saved contacts from DB table.  
	*/
	public String viewContact(Model model) {
		
		return null;
	}
}
