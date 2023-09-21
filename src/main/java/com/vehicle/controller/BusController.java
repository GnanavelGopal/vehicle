package com.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.customexception.BrandNotFoundException;
import com.vehicle.customexception.InvalidBoardException;
import com.vehicle.entity.Bus;
import com.vehicle.service.BusService;

@RestController
@RequestMapping("/bus")
public class BusController {
	@Autowired
	BusService bs;

	@PatchMapping(value = "/setBus")
	public String setBus(@RequestBody Bus bus) throws InvalidBoardException {
		return bs.setBus(bus);
	}

	@PostMapping(value = "setAllBus")
	public String setAllBus(@RequestBody List<Bus> buses) throws InvalidBoardException {
		return bs.setAllBus(buses);
	}

	@GetMapping(value = "/getAllBus")

	public List<Bus> getAllBus() {
		return bs.getAllBus();
	}

	@GetMapping(value = "/getById/{x}")
	public Bus getById(@PathVariable int x) throws Exception {
		return bs.getById(x);
	}

	@GetMapping(value = "/getByBrand/{x}")
	public List<Bus> getByBrand(@PathVariable String x) throws BrandNotFoundException {
		return bs.getByBrand(x);
	}
}
