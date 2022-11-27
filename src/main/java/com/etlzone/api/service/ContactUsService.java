package com.etlzone.api.service;

import org.springframework.stereotype.Service;

import com.etlzone.api.request.ContactUsRequest;

@Service
public interface ContactUsService {

	ContactUsRequest createContactUs(ContactUsRequest request);
}