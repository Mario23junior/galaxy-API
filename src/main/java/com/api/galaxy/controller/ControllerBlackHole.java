package com.api.galaxy.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.galaxy.dto.BlackHoleDTO;
import com.api.galaxy.service.BlackHoleService;

@RestController
@RequestMapping("/project/api/blackHoles/")
public class ControllerBlackHole {
   
	private BlackHoleService service;
	
	public ControllerBlackHole(BlackHoleService service) {
		this.service = service;
 	}
	
	@GetMapping
	List<BlackHoleDTO> listAll() {
		return service.listAllData();
	}
}
