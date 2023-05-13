package com.devsuperior.bds02.services;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.bds02.dto.EventDTO;
import com.devsuperior.bds02.entities.City;
import com.devsuperior.bds02.entities.Event;
import com.devsuperior.bds02.repositories.EventsRepository;
import com.devsuperior.bds02.services.exception.ResourceNotFoundException;

@Service
public class EventService {
	
	@Autowired
	private EventsRepository repository;
	
	@Transactional
	public EventDTO update(Long id, EventDTO dto) {
		try {
			Event entity = repository.getOne(id);
			copyToEntity(entity, dto);
			entity = repository.save(entity);
			return new EventDTO(entity);
		}catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not found " + id);
		}
	}
	
	private void copyToEntity(Event newObj, EventDTO dto) {
		newObj.setName(dto.getName());
		newObj.setDate(dto.getDate());
		newObj.setUrl(dto.getUrl());
		newObj.setCity(new City(dto.getCityId(),null));
	}
}
