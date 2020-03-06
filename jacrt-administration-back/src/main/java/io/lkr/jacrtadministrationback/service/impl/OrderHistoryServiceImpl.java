package io.lkr.jacrtadministrationback.service.impl;


import io.lkr.jacrtadministrationback.dao.OrderHistoryMapper;
import io.lkr.jacrtadministrationback.po.Order;
import io.lkr.jacrtadministrationback.po.OrderHistory;
import io.lkr.jacrtadministrationback.service.OrderHistoryService;
import io.lkr.jacrtadministrationback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class OrderHistoryServiceImpl implements OrderHistoryService {

    @Autowired
    private OrderHistoryMapper orderHistoryMapper;

    @Resource
    private OrderService orderService;


    public List<OrderHistory> getByOrderId(Long orderId) {
        List<OrderHistory> orderHistories = orderHistoryMapper.selectByOrderId(orderId);
        return orderHistories;
    }


    @Transactional
    public Long create(OrderHistory orderHistory) {
        orderHistoryMapper.insertSelective(orderHistory);
        Order order = new Order();
        order.setOrderId(orderHistory.getOrderId());
        order.setStatus(orderHistory.getOrderStatus());
        order.setUpdateTime(new Date());
        orderService.update(order);
        Long orderHistoryId = orderHistory.getOrderHistoryId();
        return orderHistoryId;
    }
}
