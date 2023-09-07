package com.org.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dao.HomeOwnerDao;
import com.org.dao.LocationDao;
import com.org.dao.PolicyDao;
import com.org.dao.PropertyDao;
import com.org.dao.QuotationDao;
import com.org.dao.UserDao;
import com.org.entities.Homeowner;
import com.org.entities.Location;
import com.org.entities.Policy;
import com.org.entities.Property;
import com.org.entities.Quotation;
import com.org.entities.User;

@Service
public class InsuranceServiceImpl implements InsuranceService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private QuotationDao quotationDao;

	@Autowired
	private LocationDao locationDao;

	@Autowired
	private HomeOwnerDao homeownerDao;

	@Autowired
	private PropertyDao propertyDao;

	@Autowired
	private PolicyDao policyDao;

	public InsuranceServiceImpl() {
	}

	@Override
	public List<User> getUsers() {
		return userDao.findAll();
	}

	@Override
	public User getUser(long id) {
		return userDao.findById(id).get();
	}

	@Override
	public User addUser(User user) {
		return userDao.save(user);
	}

	@Override
	public User getUser(String username, String password) {
		User user = userDao.findByUsername(username);
		if (user == null) {
			// throw new RuntimeException("User does not exist.");
			return null;
		}
		if (!user.getPassword().equals(password)) {
			// throw new RuntimeException("Password mismatch.");
			return null;
		}
		return user;
	}

	@Override
	public List<Quotation> getQuotations() {
		return quotationDao.findAll();
	}

	@Override
	public Quotation addQuotation(Quotation quotation) {
		return quotationDao.save(quotation);
	}

	@Override
	public List<Quotation> getQuotations(String username) {
		return quotationDao.findByUsername(username);
	}

	@Override
	public Quotation getQuotation(Long id) {
		return quotationDao.findById(id).get();
	}

	@Override
	public List<Location> getLocations() {
		return locationDao.findAll();
	}

	@Override
	public Location addLocation(Location location) {
		return locationDao.save(location);
	}

	@Override
	public List<Homeowner> getHomeowners() {
		return homeownerDao.findAll();
	}

	@Override
	public Homeowner addHomeowner(Homeowner homeowner) {
		return homeownerDao.save(homeowner);
	}

	@Override
	public List<Property> getProperties() {
		return propertyDao.findAll();
	}

	@Override
	public Property addProperty(Property property) {
		return propertyDao.save(property);
	}

	@Override
	public List<Policy> getPolicies() {
		return policyDao.findAll();
	}

	@Override
	public List<Policy> getPolicies(String username) {
		return policyDao.findByUsername(username);
	}

	@Override
	public Policy addPolicy(Policy policy) {
		return policyDao.save(policy);
	}

	@Override
	public Policy getPolicy(Long quotationId) {
		return policyDao.findByQuotationId(quotationId);
	}
}
