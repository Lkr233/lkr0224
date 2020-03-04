package io.lkr.jacrtstoreback.service;


import io.lkr.jacrtstoreback.dto.in.CustomerRegisterInDTO;
import io.lkr.jacrtstoreback.po.Customer;

public interface CustomerService {

    Integer register(CustomerRegisterInDTO customerRegisterInDTO);

    Customer getByUsername(String username);

    Customer getById(Integer customerId);

    Customer getByEmail(String email);

    void update(Customer customer);

}
