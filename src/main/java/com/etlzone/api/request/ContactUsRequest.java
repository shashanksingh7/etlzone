package com.etlzone.api.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ContactUsRequest {

	private long id;

	private String name;

	private String emailId;

	private String subject;

	private String message;
}