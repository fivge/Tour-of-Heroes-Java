package com.example.demo.city;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/city")
public class CityController {

	@Autowired
	private CityService cityService;

	@PostMapping(path = "/add")
	public String addNewGhost(@RequestBody City city) {
		cityService.insert(city);
		return "Saved";
	}

	@GetMapping(path = "/all")
	public City getAllGhosts(@RequestParam Long id) {
		return cityService.findById(id);
	}
}
