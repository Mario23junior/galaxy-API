package com.api.galaxy.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.api.galaxy.service.cargaService;

@Configuration
@Profile("dev")
public class cargaConfig {
  
	@Autowired
	private cargaService powerDataBase;
	
	@Bean
	public void cargaBaseData() {
		this.powerDataBase.powerDataBase();
	}
}
