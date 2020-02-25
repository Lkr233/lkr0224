package io.lkr.jacrtstoreback.controller;


import io.lkr.jacrtstoreback.dto.in.ProductSearchInDTO;
import io.lkr.jacrtstoreback.dto.out.PageOutDTO;
import io.lkr.jacrtstoreback.dto.out.ProductListOutDTO;
import io.lkr.jacrtstoreback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

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

}
