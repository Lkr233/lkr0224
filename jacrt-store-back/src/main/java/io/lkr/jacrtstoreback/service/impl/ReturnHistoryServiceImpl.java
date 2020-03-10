package io.lkr.jacrtstoreback.service.impl;


import io.lkr.jacrtstoreback.dao.ReturnHistoryMapper;
import io.lkr.jacrtstoreback.po.ReturnHistory;
import io.lkr.jacrtstoreback.service.ReturnHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ReturnHistoryServiceImpl implements ReturnHistoryService {

    @Resource
    private ReturnHistoryMapper returnHistoryMapper;


    public List<ReturnHistory> getByReturnId(Integer returnId) {
        List<ReturnHistory> returnHistories = returnHistoryMapper.selectByReturnId(returnId);
        return returnHistories;
    }
}
