package io.lkr.jacrtadministrationback.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.lkr.jacrtadministrationback.dao.ReturnMapper;
import io.lkr.jacrtadministrationback.po.Return;
import io.lkr.jacrtadministrationback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReturnServiceImpl implements ReturnService {

    @Autowired
    private ReturnMapper returnMapper;


    public Page<Return> search(Integer pageNum) {
        PageHelper.startPage(pageNum, 10);
        Page<Return> page = returnMapper.search();
        return page;
    }
}
