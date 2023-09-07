package com.org.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.entities.Location;

public interface LocationDao extends JpaRepository<Location, Long> {

}