package io.lkr.jacrtadministrationback.controller;

import io.lkr.jacrtadministrationback.dto.in.AdministratorLoginInDTO;
import io.lkr.jacrtadministrationback.dto.in.AdministratorUpdateProfileInDTO;
import io.lkr.jacrtadministrationback.dto.out.AdministratorGetProfileOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {

    @GetMapping("/login")
    public String login(AdministratorLoginInDTO administratorLoginInDTO){
        return null;
    }


    @GetMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(Integer administratorId){

        return null;
    }

    @PostMapping("/updateProdfile")
    public void updateProdfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){

    }

}
