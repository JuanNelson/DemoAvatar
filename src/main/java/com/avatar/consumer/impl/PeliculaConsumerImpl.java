package com.avatar.consumer.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.avatar.consumer.PeliculaConsumer;

@Repository
public class PeliculaConsumerImpl implements PeliculaConsumer{

	@Value( "${url.film.service}" )
	public String uri;

	@Override
	public String getPeliculas() {
	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);
	    return result;
	}

}
