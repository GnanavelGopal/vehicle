package com.vehicle.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.vehicle.dao.BikeDao;
import com.vehicle.entity.BikeEntity;

@Service
public class BikeService {
	@Autowired
	BikeDao bd;

	public String setBike(@RequestBody BikeEntity bike) {
		return bd.setBike(bike);
	}

	public String setAllBike(@RequestBody List<BikeEntity> bikes) {
		return bd.setAllBike(bikes);
	}

	public List<BikeEntity> getAllBike() {
		return bd.getAllBike();
	}

	public BikeEntity getById(int x) {
		return bd.getById(x);
	}

	public String getDeleteId(int x) {
		return bd.getDeleteId(x);
	}

	public List<BikeEntity> getByBrand(String b) {
		List<BikeEntity> m = getAllBike();
		List<BikeEntity> list = m.stream().filter(y -> y.getBrand().equalsIgnoreCase(b)).collect(Collectors.toList());
		return list;
	}

	public List<BikeEntity> getByRange(int a, int b) {
		List<BikeEntity> x = getAllBike();
		List<BikeEntity> lists = x.stream().filter((m) -> (m.getPrice() >= a && m.getPrice() <= b))
				.collect(Collectors.toList());
		return lists;
	}


	public List<String> getBrandByColor(String a) {
		List<BikeEntity> x=getAllBike();
		List<String> color=x.stream().filter(m->m.getColor().equalsIgnoreCase(a)).map(m->m.getBrand()).collect(Collectors.toList());
		return color;
	}

	public BikeEntity getMax() {
		List<BikeEntity> x=getAllBike();
		BikeEntity max=x.stream().max(Comparator.comparing(BikeEntity::getPrice)).get();
		return max;
	}

	public BikeEntity getMin() {
		List<BikeEntity> x=getAllBike();
		BikeEntity min=x.stream().min(Comparator.comparing(BikeEntity::getPrice)).get();
		return min;
	}

	public List<BikeEntity> getReducedBike(int x) {
		List<BikeEntity> m=getAllBike();
		List<BikeEntity> reduce=m.stream().peek(n->n.setPrice(n.getPrice()-n.getPrice()*x/100)).collect(Collectors.toList());
		return reduce;
	}

	public long getCount(String x) {
	List<BikeEntity> m=getAllBike();
	List<String> count=m.stream().filter(n->n.getColor().equalsIgnoreCase(x)).map(y->y.getBrand()).collect(Collectors.toList());
		long a=count.stream().count();
		return a;
	}

	public String update(int x, BikeEntity b) {
		BikeEntity m=getById(x);
		BikeEntity n=b;
		m.setId(x);
		m.setColor(n.getColor());
		return setBike(m);
	}
}
