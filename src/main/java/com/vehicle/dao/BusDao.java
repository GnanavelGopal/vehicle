package com.vehicle.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vehicle.customexception.NoValueException;
import com.vehicle.entity.Bus;
import com.vehicle.repository.BusRepository;

@Repository
public class BusDao {
	@Autowired
	BusRepository br;

	public String setBus(Bus bus) {
		br.save(bus);
		return "saved";
	}

	public String setAllBus(List<Bus> buses) {
		br.saveAll(buses);
		return "saved all";
	}

	public List<Bus> getAllBus() {
		return br.findAll();
	}

	public Bus getById(int x) throws Exception {
		return br.findById(x).orElseThrow(() -> new NoValueException("Not this id"));
	}

	public List<Bus> getByBrand(String x) {
		return br.getByBrand(x);
	}

}
