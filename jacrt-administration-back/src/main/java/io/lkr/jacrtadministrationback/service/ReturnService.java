package io.lkr.jacrtadministrationback.service;

import com.github.pagehelper.Page;
import io.lkr.jacrtadministrationback.po.Return;

public interface ReturnService {

    Page<Return> search(Integer pageNum);

}
