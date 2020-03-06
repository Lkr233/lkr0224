package io.lkr.jacrtadministrationback.service;


import io.lkr.jacrtadministrationback.po.Address;

import java.util.List;

public interface AddressService {

    Address getById(Integer addressId);

    List<Address> getByCustomerId(Integer customerId);

}
