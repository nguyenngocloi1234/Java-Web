package service;

import model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> read();
    void create(Customer customer);
    Customer findById(int id);
    void update(int id, Customer customer);
    void delete(int id);
    List<Customer> findByName(String name);
}
