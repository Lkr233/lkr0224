package io.lkr.jacrtadministrationback.service;

import com.github.pagehelper.Page;
import io.lkr.jacrtadministrationback.dto.in.CustomerSetStatusInDTO;
import io.lkr.jacrtadministrationback.po.Customer;

public interface CustomerService {

    Page<Customer> search(Integer pageNum);

    Customer getById(Integer customerId);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);

}
