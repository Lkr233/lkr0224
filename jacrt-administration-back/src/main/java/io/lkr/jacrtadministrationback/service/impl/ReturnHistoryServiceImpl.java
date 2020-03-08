package io.lkr.jacrtadministrationback.service.impl;


import io.lkr.jacrtadministrationback.dao.ReturnHistoryMapper;
import io.lkr.jacrtadministrationback.po.Return;
import io.lkr.jacrtadministrationback.po.ReturnHistory;
import io.lkr.jacrtadministrationback.service.ReturnHistoryService;
import io.lkr.jacrtadministrationback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class ReturnHistoryServiceImpl implements ReturnHistoryService {

    @Autowired
    private ReturnHistoryMapper returnHistoryMapper;

    @Autowired
    private ReturnService returnService;


    public List<ReturnHistory> getListByReturnId(Integer returnId) {
        List<ReturnHistory> returnHistories = returnHistoryMapper.selectListByReturnId(returnId);
        return returnHistories;
    }


    @Transactional
    public Integer create(ReturnHistory returnHistory) {
        returnHistoryMapper.insertSelective(returnHistory);
        Integer returnHistoryId = returnHistory.getReturnHistoryId();

        Return aReturn = new Return();
        aReturn.setReturnId(returnHistory.getReturnId());
        aReturn.setUpdateTime(new Date());
        returnService.update(aReturn);

        return returnHistoryId;
    }
}
