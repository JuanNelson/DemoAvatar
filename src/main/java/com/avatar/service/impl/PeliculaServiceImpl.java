package com.avatar.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avatar.consumer.PeliculaConsumer;
import com.avatar.service.PeliculaService;

@Service
public class PeliculaServiceImpl implements PeliculaService{
		
	@Autowired
	PeliculaConsumer peliculaConsumer;

	@Override
	public String getPeliculas() {
	    return peliculaConsumer.getPeliculas();
	}
	
}
