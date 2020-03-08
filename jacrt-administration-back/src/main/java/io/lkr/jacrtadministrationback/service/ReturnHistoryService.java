package io.lkr.jacrtadministrationback.service;


import io.lkr.jacrtadministrationback.po.ReturnHistory;

import java.util.List;

public interface ReturnHistoryService {

    List<ReturnHistory> getListByReturnId(Integer returnId);

    Integer create(ReturnHistory returnHistory);

}
