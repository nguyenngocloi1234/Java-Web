package com.codegym.cms.service;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Province;
import com.codegym.cms.request.CustomerRequest;
import com.codegym.cms.response.CustomerResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
//    Page<Customer> findAll(Pageable pageable);
//    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
//
//    Customer findById(Long id);
//
//    void save(Customer customer);
//
//    void remove(Long id);
//
//    Iterable<Customer> findAllByProvince(Province province);
    Page<CustomerResponse> findAll(Pageable pageable);
    Page<CustomerResponse> findAllByFirstNameContaining(String firstname, Pageable pageable);

    CustomerResponse findById(Long id);

    void save(CustomerRequest customerRequest);

    void remove(Long id);

   Iterable<CustomerResponse> findAllByProvince(Province province);


}