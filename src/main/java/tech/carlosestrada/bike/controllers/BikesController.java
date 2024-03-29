package tech.carlosestrada.bike.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tech.carlosestrada.bike.models.Bike;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {

	@GetMapping
	public List<Bike> listAllBikes() {
		List<Bike> bikes = new ArrayList<>();
		return bikes;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody Bike bike) {

	}

	@GetMapping("{id}")
	public Bike getById(@PathVariable("id") long id) {
		return new Bike();
	}
}
