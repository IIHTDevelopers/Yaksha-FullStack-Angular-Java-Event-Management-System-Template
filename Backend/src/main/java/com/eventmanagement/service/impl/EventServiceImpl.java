package com.eventmanagement.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventmanagement.dto.EventDTO;
import com.eventmanagement.repo.EventDAO;
import com.eventmanagement.service.EventService;

@Service
public class EventServiceImpl implements EventService {
	
	@Autowired
	private final EventDAO eventDAO;
	
	@Autowired
	private final ModelMapper modelMapper;

	@Autowired
	public EventServiceImpl(EventDAO eventDAO, ModelMapper modelMapper) {
		this.eventDAO = eventDAO;
		this.modelMapper = modelMapper;
	}

	@Override
	public EventDTO createEvent(EventDTO eventDTO) {
		return null;
	}

	@Override
	public EventDTO getEventById(Long id) {
		return null;
	}

	@Override
	public List<EventDTO> getAllEvents() {
		return null;
	}

	@Override
	public List<EventDTO> searchEventsByName(String name) {
		return null;
	}

	@Override
	public List<EventDTO> searchEventsByStatus(String status) {
		return null;
	}
	
	@Override
	public EventDTO updateEvent(Long id, EventDTO eventDTO) {
		return null;
	}

	@Override
	public boolean deleteEvent(Long id) {
		return false;
	}
}
