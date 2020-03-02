package io.lkr.jacrtadministrationback.service;

import com.github.pagehelper.Page;
import io.lkr.jacrtadministrationback.po.Administrator;

import java.util.List;

public interface AdministratorService {

    Administrator getById(Integer administratorId);

    Administrator getByUsername(String username);

    Integer create(Administrator administrator);

    void update(Administrator administrator);

    void delete(Integer administratorId);

    void batchDelete(List<Integer> administratorIds);

    Page<Administrator> getList(Integer pageNum);

}
