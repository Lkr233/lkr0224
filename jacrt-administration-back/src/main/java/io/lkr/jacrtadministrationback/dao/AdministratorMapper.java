package io.lkr.jacrtadministrationback.dao;

import com.github.pagehelper.Page;
import io.lkr.jacrtadministrationback.po.Administrator;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdministratorMapper {
    int deleteByPrimaryKey(Integer administratorId);

    int insert(Administrator record);

    int insertSelective(Administrator record);

    Administrator selectByPrimaryKey(Integer administratorId);

    int updateByPrimaryKeySelective(Administrator record);

    int updateByPrimaryKey(Administrator record);

    Administrator selectByUsername(String username);

    Page<Administrator> selectList();

    void batchDelete(List<Integer> administratorIds);

    Administrator selectByEmail(String email);
}