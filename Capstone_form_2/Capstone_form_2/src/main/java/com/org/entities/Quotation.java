package com.org.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Quotation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "location_id", referencedColumnName = "id")
	private Location location;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "homeowner_id", referencedColumnName = "id")
	private Homeowner homeowner;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "property_id", referencedColumnName = "id")
	private Property property;
	private String username;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Homeowner getHomeowner() {
		return homeowner;
	}

	public void setHomeowner(Homeowner homeowner) {
		this.homeowner = homeowner;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
