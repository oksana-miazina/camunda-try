package org.example.controller;

import org.example.model.Person;
import org.example.service.CamundaStartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@Autowired
	CamundaStartService camundaStartService;

	@RequestMapping("/get")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping(value = "/msgeventstart", method = RequestMethod.POST)
	public void persistPerson(@RequestBody Person obj) {
		camundaStartService.startProcessByMessage(obj);
	}
}