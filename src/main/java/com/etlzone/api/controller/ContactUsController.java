package com.etlzone.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etlzone.api.request.ContactUsRequest;
import com.etlzone.api.service.ContactUsService;

@RestController
@RequestMapping("/contact-us")

public class ContactUsController {
	
	@Autowired
	private ContactUsService contactUsService;

	/**
	 * 
	 * @param request
	 * @return
	 */
	@PostMapping
	public ResponseEntity<ContactUsRequest> createRole( @RequestBody ContactUsRequest request) {
		return new ResponseEntity<ContactUsRequest>(contactUsService.createContactUs(request), HttpStatus.CREATED);
	}

}
