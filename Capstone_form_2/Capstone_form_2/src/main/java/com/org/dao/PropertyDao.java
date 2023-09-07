package com.org.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.entities.Property;

public interface PropertyDao extends JpaRepository<Property, Long> {

}
