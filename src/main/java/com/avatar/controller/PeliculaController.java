package com.avatar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.avatar.service.PeliculaService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class PeliculaController {
	
	@Autowired
	PeliculaService peliculaService;

	  @GetMapping("/peliculas")
	  public String getPeliculas() {
	    return peliculaService.getPeliculas();
	  }
	
}
	