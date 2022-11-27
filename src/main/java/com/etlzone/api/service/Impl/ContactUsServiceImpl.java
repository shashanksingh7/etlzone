package com.etlzone.api.service.Impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etlzone.api.entity.ContactUs;
import com.etlzone.api.repository.ContactUsRepository;
import com.etlzone.api.request.ContactUsRequest;
import com.etlzone.api.service.ContactUsService;

@Service
public class ContactUsServiceImpl implements ContactUsService {

	@Autowired
	private ContactUsRepository contactUsRepository;

	@Override
	public ContactUsRequest createContactUs(ContactUsRequest request) {
		ContactUs contactUs = new ContactUs();
		//contactUs.setId(request.getId());
		contactUs.setName(request.getName());
		contactUs.setEmailId(request.getEmailId());
		contactUs.setSubject(request.getSubject());
		
		contactUs.setMessage(request.getMessage());

		java.util.Date date = new java.util.Date();
		Date l_sqlDate = new java.sql.Date(date.getTime());

		contactUs.setCreatedAt(l_sqlDate);
		contactUs.setModifiedAt(l_sqlDate);
		contactUs.setModifiedBy("ETLZONESYSTEM");

		contactUs.setCreatedBy("ETLZONESYSTEM");
		ContactUs newContactUs = contactUsRepository.save(contactUs);
		// Convert Entity to Dto
		ContactUsRequest contactUsRequest = new ContactUsRequest();
		contactUsRequest.setId(newContactUs.getId());
		contactUsRequest.setName(newContactUs.getName());
		contactUsRequest.setEmailId(newContactUs.getEmailId());
		contactUsRequest.setSubject(newContactUs.getSubject());
		contactUsRequest.setMessage(newContactUs.getMessage());
		return contactUsRequest;
	}

}
