package io.lkr.jacrtstoreback.service.impl;


import io.lkr.jacrtstoreback.dao.OrderHistoryMapper;
import io.lkr.jacrtstoreback.po.OrderHistory;
import io.lkr.jacrtstoreback.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderHistoryServiceImpl implements OrderHistoryService {

    @Resource
    private OrderHistoryMapper orderHistoryMapper;


    public List<OrderHistory> getByOrderId(Long orderId) {
        List<OrderHistory> orderHistories = orderHistoryMapper.selectByOrderId(orderId);
        return orderHistories;
    }
}
