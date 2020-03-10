package io.lkr.jacrtstoreback.service;


import io.lkr.jacrtstoreback.po.ReturnHistory;

import java.util.List;

public interface ReturnHistoryService {

    List<ReturnHistory> getByReturnId(Integer returnId);

}
