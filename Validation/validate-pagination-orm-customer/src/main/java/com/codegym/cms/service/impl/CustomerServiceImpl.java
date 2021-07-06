package com.codegym.cms.service.impl;

import com.codegym.cms.convert.CustomerConvert;
import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Province;
import com.codegym.cms.repository.CustomerRepository;
import com.codegym.cms.request.CustomerRequest;
import com.codegym.cms.response.CustomerResponse;
import com.codegym.cms.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Page<CustomerResponse> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable).map(c->CustomerConvert.convertToCustomerResponse(c));
    }

    @Override
    public Page<CustomerResponse> findAllByFirstNameContaining(String firstname, Pageable pageable) {
        return customerRepository.findAllByFirstNameContaining(firstname,pageable).map(c ->CustomerConvert.convertToCustomerResponse(c));
    }

    @Override
    public CustomerResponse findById(Long id) {
        return CustomerConvert.convertToCustomerResponse(customerRepository.findOne(id));
    }

    @Override
    public void save(CustomerRequest customerRequest) {
        customerRepository.save(CustomerConvert.convertToCustomer(customerRequest));
    }

    @Override
    public void remove(Long id) {
        customerRepository.delete(id);
    }

    @Override
    public Iterable<CustomerResponse> findAllByProvince(Province province) {
        return StreamSupport.stream(customerRepository.findAllByProvince(province).spliterator(),
                            false)
                            .map(CustomerConvert::convertToCustomerResponse).collect(Collectors.toList());
        //return customerRepository.findAllByProvince(province);
    }


//    public Page<CustomerResponse> findAllCustomers(Pageable pageable) {
//       // customerRepository.findAll(pageable).map(c -> CustomerConvert.convertToCustomerResponse(c));
//        return customerRepository.findAll(pageable).map(CustomerConvert::convertToCustomerResponse);
//    }
}