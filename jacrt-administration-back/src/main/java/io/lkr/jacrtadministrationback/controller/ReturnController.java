package io.lkr.jacrtadministrationback.controller;


import io.lkr.jacrtadministrationback.dto.in.ReturnSearchInDTO;
import io.lkr.jacrtadministrationback.dto.in.ReturnUpdateActionInDTO;
import io.lkr.jacrtadministrationback.dto.out.PageOutDTO;
import io.lkr.jacrtadministrationback.dto.out.ReturnListOutDTO;
import io.lkr.jacrtadministrationback.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
public class ReturnController {

    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO,
                                               @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }

}
