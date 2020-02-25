package io.lkr.jacrtadministrationback.controller;


import io.lkr.jacrtadministrationback.dto.in.CustomerSearchInDTO;
import io.lkr.jacrtadministrationback.dto.out.CustomerListOutDTO;
import io.lkr.jacrtadministrationback.dto.out.CustomerShowOutDTO;
import io.lkr.jacrtadministrationback.dto.out.PageOutDTO;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(CustomerSearchInDTO customerSearchInDTO,
                                                 @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId){
        return null;
    }

    @PostMapping("/disable")
    public void disable(@RequestParam Integer customerId){

    }

}
