package com.eventmanagement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.eventmanagement.service.EventService;

@RestController
@CrossOrigin

public class EventController {
	
	@Autowired
	private EventService eventService;

	
}
