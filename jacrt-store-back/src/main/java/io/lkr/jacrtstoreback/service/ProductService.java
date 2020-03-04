package io.lkr.jacrtstoreback.service;


import com.github.pagehelper.Page;
import io.lkr.jacrtstoreback.dto.out.ProductListOutDTO;
import io.lkr.jacrtstoreback.dto.out.ProductShowOutDTO;
import io.lkr.jacrtstoreback.po.Product;


public interface ProductService {

    Product getById(Integer productId);

    ProductShowOutDTO getShowById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
