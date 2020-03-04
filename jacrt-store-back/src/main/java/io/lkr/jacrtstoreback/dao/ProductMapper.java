package io.lkr.jacrtstoreback.dao;

import com.github.pagehelper.Page;
import io.lkr.jacrtstoreback.dto.out.ProductListOutDTO;
import io.lkr.jacrtstoreback.po.Product;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    Page<ProductListOutDTO> search();
}