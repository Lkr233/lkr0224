package io.lkr.jacrtstoreback.service;

import com.github.pagehelper.Page;
import io.lkr.jacrtstoreback.dto.in.OrderCheckoutInDTO;
import io.lkr.jacrtstoreback.dto.out.OrderShowOutDTO;
import io.lkr.jacrtstoreback.po.Order;


public interface OrderService {

    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO,
                  Integer customerId);

    Page<Order> getByCustomerId(Integer pageNum, Integer customerId);

    OrderShowOutDTO getById(Long orderId);
}
