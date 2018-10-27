package com.frank.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.frank.boot.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck,Long>{

}
