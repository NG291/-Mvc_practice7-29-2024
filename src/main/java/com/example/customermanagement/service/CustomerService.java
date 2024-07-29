package com.example.customermanagement.service;

import com.example.customermanagement.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> finAll();

    void save( Customer customer);

    Customer finByID(int id);

    void update(int id, Customer customer);

    void remove(int id);
}
