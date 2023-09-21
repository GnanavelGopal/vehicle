package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicle.entity.BikeEntity;

public interface BikeRepository extends JpaRepository<BikeEntity, Integer> {

}
