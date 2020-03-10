package io.lkr.jacrtstoreback.service;


import io.lkr.jacrtstoreback.po.OrderHistory;

import java.util.List;

public interface OrderHistoryService {

    List<OrderHistory> getByOrderId(Long orderId);

}
