package com.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.entity.BikeEntity;
import com.vehicle.service.BikeService;

@RestController
@RequestMapping("/bike")
public class BikeController {
	@Autowired
	BikeService bc;

	@PostMapping(value = "/setBike")
	public String setBike(@RequestBody BikeEntity bike) {
		return bc.setBike(bike);
	}

	@PostMapping(value = "/setAllBike")
	public String setAllBike(@RequestBody List<BikeEntity> bikes) {
		return bc.setAllBike(bikes);
	}

	@GetMapping(value = "/getAllBike")
	public List<BikeEntity> getAllBike() {
		return bc.getAllBike();
	}

	@GetMapping(value = "/getById/{x}")
	public BikeEntity getById(@PathVariable int x) {
		return bc.getById(x);
	}

	@DeleteMapping(value = "getDeleteId/{x}")
	public String getDeleteId(@PathVariable int x) {
		return bc.getDeleteId(x);
	}

	@GetMapping(value = "getByBrand/{b}")
	public List<BikeEntity> getByBrand(@PathVariable String b) {
		return bc.getByBrand(b);
	}

	@GetMapping(value = "getByRange/{a}/{b}")
	public List<BikeEntity> getByRange(@PathVariable int a, @PathVariable int b) {
		return bc.getByRange(a, b);
	}

	@GetMapping(value = "getBrandByColor/{a}")
	public List<String> getBrandByColor(@PathVariable String a) {
		return bc.getBrandByColor(a);

	}

	@GetMapping(value = "getMax")
	public BikeEntity getMax() {
		return bc.getMax();
	}

	@GetMapping(value = "getMin")
	public BikeEntity getMin() {
		return bc.getMin();
	}
	@GetMapping(value="getCount/{x}")
	public long getCount(String x) {
		return bc.getCount(x);
	}

	@GetMapping(value = "getReducedBike/{x}")
	public List<BikeEntity> getReducedBike(@PathVariable int x) {
		return bc.getReducedBike(x);
	}
	@PutMapping("/update/{x}")
	public String update(@PathVariable int x,@RequestBody BikeEntity b) {
		return bc.update(x,b);
	}
}
