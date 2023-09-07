package com.org.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.entities.Homeowner;

public interface HomeOwnerDao extends JpaRepository<Homeowner, Long> {

}
