package io.lkr.jacrtstoreback.service.impl;




import io.lkr.jacrtstoreback.dao.AddressMapper;
import io.lkr.jacrtstoreback.po.Address;
import io.lkr.jacrtstoreback.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Resource
    private AddressMapper addressMapper;



    public Address getById(Integer addressId) {
        Address address = addressMapper.selectByPrimaryKey(addressId);
        return address;
    }


    public List<Address> getByCustomerId(Integer customerId) {
        List<Address> addresses = addressMapper.selectByCustomerId(customerId);
        return addresses;
    }


    public Integer create(Address address) {
        addressMapper.insertSelective(address);
        Integer addressId = address.getAddressId();
        return addressId;
    }


    public void update(Address address) {
        addressMapper.updateByPrimaryKeySelective(address);
    }


    public void delete(Integer addressId) {
        addressMapper.deleteByPrimaryKey(addressId);
    }



}
