package io.lkr.jacrtadministrationback.controller;


import io.lkr.jacrtadministrationback.dto.in.ProductCreateInDTO;
import io.lkr.jacrtadministrationback.dto.in.ProductSearchInDTO;
import io.lkr.jacrtadministrationback.dto.in.ProductUpdateInDTO;
import io.lkr.jacrtadministrationback.dto.out.PageOutDTO;
import io.lkr.jacrtadministrationback.dto.out.ProductListOutDTO;
import io.lkr.jacrtadministrationback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){

    }

    @PostMapping("/delete")
    public void delete(@RequestBody Integer productId){

    }

    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> productIds){

    }

}
