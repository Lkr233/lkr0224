package io.lkr.jacrtadministrationback.service;

import com.github.pagehelper.Page;
import io.lkr.jacrtadministrationback.dto.out.OrderListOutDTO;
import io.lkr.jacrtadministrationback.dto.out.OrderShowOutDTO;
import io.lkr.jacrtadministrationback.po.Order;

public interface OrderService {

    Page<OrderListOutDTO> search(Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

    void update(Order order);

}
