package io.lkr.jacrtadministrationback.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.lkr.jacrtadministrationback.dao.CustomerMapper;
import io.lkr.jacrtadministrationback.dto.in.CustomerSetStatusInDTO;
import io.lkr.jacrtadministrationback.po.Customer;
import io.lkr.jacrtadministrationback.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;


    public Page<Customer> search(Integer pageNum) {
        PageHelper.startPage(pageNum, 10);
        Page<Customer> page = customerMapper.search();
        return page;
    }


    public Customer getById(Integer customerId) {
        Customer customer = customerMapper.selectByPrimaryKey(customerId);
        return customer;
    }


    public void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO) {
        Customer customer = new Customer();
        customer.setCustomerId(customerSetStatusInDTO.getCustomerId());
        customer.setStatus(customerSetStatusInDTO.getStatus());
        customerMapper.updateByPrimaryKeySelective(customer);
    }
}
