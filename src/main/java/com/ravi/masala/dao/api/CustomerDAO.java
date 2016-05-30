package com.ravi.masala.dao.api;

import java.util.List;

import com.ravi.masala.domain.Customer;

public interface CustomerDAO {

	 public boolean addCustomer(Customer customer);

	    public List<Customer> listCustomer();

	    public void removeCustomer(Integer id);
}
