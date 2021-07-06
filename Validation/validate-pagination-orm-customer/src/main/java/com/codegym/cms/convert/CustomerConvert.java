package com.codegym.cms.convert;

import com.codegym.cms.model.Customer;
import com.codegym.cms.request.CustomerRequest;
import com.codegym.cms.response.CustomerResponse;

public class CustomerConvert {

    public static Customer convertToCustomer(CustomerRequest customerRequest) {
        Customer customer = new Customer();
        customer.setId(customerRequest.getId());
        customer.setFirstName(customerRequest.getFirstName());
        customer.setLastName(customerRequest.getLastName());
        customer.setProvince(customerRequest.getProvince());
        return customer;
    }

    public static CustomerResponse convertToCustomerResponse(Customer customer) {
        CustomerResponse customerResponse = new CustomerResponse();
        customerResponse.setId(customer.getId());
        customerResponse.setFirstName(customer.getFirstName());
        customerResponse.setLastName(customer.getLastName());
        customerResponse.setProvince(customer.getProvince());
        return customerResponse;
//        return CustomerResponse.builder()
//                .id(customer.getId())
//                .firstName(customer.getFirstName())
//                .lastName(customer.getLastName())
//                .build();

    }


}
