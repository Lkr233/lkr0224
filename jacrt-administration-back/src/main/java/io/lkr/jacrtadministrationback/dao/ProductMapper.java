package io.lkr.jacrtadministrationback.dao;

import com.github.pagehelper.Page;
import io.lkr.jacrtadministrationback.dto.out.ProductListOutDTO;
import io.lkr.jacrtadministrationback.po.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    void batchDelete(List<Integer> productIds);

    Page<ProductListOutDTO> search();
}