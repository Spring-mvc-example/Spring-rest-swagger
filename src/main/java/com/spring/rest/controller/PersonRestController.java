package com.spring.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.dto.Person;
import com.spring.rest.dto.Response;
import com.spring.rest.service.PersonService;

@RestController
public class PersonRestController {
	@Autowired
	private PersonService service;

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public Response addPerson(@RequestBody Person person) {
		Response response = new Response();
		try {
			String serviceResp = service.addPerson(person);
			response.setStatus(true);
			response.setMessage(serviceResp);
		} catch (Exception e) {
			response.setStatus(false);
			response.setMessage(e.getMessage());
		}
		return response;
	}

	@RequestMapping(value = "/getPerson/{id}", method = RequestMethod.GET, produces = "application/json")
	public Person getPerson(@PathVariable("id") int id) {
		return service.getPerson(id);
	}

	@RequestMapping(value = "/getPersons", method = RequestMethod.GET, produces = "application/json")
	public List<Person> getPerson() {
		return service.getPersons();
	}
}
