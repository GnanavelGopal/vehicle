package com.vehicle.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.customexception.BrandNotFoundException;
import com.vehicle.customexception.InvalidBoardException;
import com.vehicle.dao.BusDao;
import com.vehicle.entity.Bus;

@Service
public class BusService {
	@Autowired
	BusDao bd;

	public String setBus(Bus bus) throws InvalidBoardException {
	try {	
		if (bus.getBoard().equalsIgnoreCase("white")) {
			return bd.setBus(bus);
		} else {
			throw new InvalidBoardException("Invalid Data");
		}
	}
	catch (InvalidBoardException e) {
		return "Invalid data";
	}
	}

	public String setAllBus(List<Bus> buses) throws InvalidBoardException {
		List<Bus> s = buses.stream()
				.filter(x -> x.getBoard().equalsIgnoreCase("white") || (x.getBoard().equalsIgnoreCase("Yellow")))
				.collect(Collectors.toList());

		if (s.isEmpty()) {
			throw new InvalidBoardException("Invalid data");
		} else {
			return bd.setAllBus(s);
		}
	}

	public List<Bus> getAllBus() {
		return bd.getAllBus();
	}

	public Bus getById(int x) throws Exception {
		return bd.getById(x);
	}

	public List<Bus> getByBrand(String x) throws BrandNotFoundException{
		List<Bus> m=bd.getByBrand(x);
			if(m.isEmpty()) {
				throw new BrandNotFoundException("No data");
			}
			else {
				return m;
			}
		}
	}

