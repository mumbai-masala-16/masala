package com.ravi.masala.service;


import java.util.List;

import com.ravi.masala.domain.Customer;

public interface CustomerService {

    public boolean addCustomer(Customer customer);

    public List<Customer> listCustomer();

    public void removeCustomer(Integer id);
}
