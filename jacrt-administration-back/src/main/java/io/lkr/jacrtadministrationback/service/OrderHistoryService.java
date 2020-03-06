package io.lkr.jacrtadministrationback.service;


import io.lkr.jacrtadministrationback.po.OrderHistory;

import java.util.List;

public interface OrderHistoryService {

    List<OrderHistory> getByOrderId(Long orderId);

    Long create(OrderHistory orderHistory);

}
