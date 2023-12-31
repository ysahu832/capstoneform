package com.org.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.entities.Quotation;

public interface QuotationDao extends JpaRepository<Quotation, Long> {
	List<Quotation> findByUsername(String username);
}
