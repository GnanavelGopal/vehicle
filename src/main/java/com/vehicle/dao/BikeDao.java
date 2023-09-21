package com.vehicle.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.vehicle.entity.BikeEntity;
import com.vehicle.repository.BikeRepository;

@Repository
public class BikeDao {
	@Autowired
	BikeRepository br;

	public String setBike(@RequestBody BikeEntity bike) {
		br.save(bike);
		return "Saved";
	}

	public String setAllBike(@RequestBody List<BikeEntity> bikes) {
		br.saveAll(bikes);
		return "Saved All";
	}

	public List<BikeEntity> getAllBike() {
		return br.findAll();
	}
	public BikeEntity getById(int x) {
		return br.findById(x).get();
	}
	public String  getDeleteId(int x) {
		 br.deleteById(x);
		 return "Successful delete";
	}
}
