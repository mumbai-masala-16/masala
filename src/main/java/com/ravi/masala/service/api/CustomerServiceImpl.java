package com.ravi.masala.service.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ravi.masala.dao.api.CustomerDAO;
import com.ravi.masala.domain.Customer;
import com.ravi.masala.service.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Transactional
    public boolean addCustomer(Customer customer) {
        return customerDAO.addCustomer(customer);
    }

    @Transactional
    public List<Customer> listCustomer() {

        return customerDAO.listCustomer();
    }

    @Transactional
    public void removeCustomer(Integer id) {
        customerDAO.removeCustomer(id);
    }

    public CustomerDAO getCustomerDAO() {
        return customerDAO;
    }

    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }
}
