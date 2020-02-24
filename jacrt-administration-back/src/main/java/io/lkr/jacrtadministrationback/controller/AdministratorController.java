package io.lkr.jacrtadministrationback.controller;

import io.lkr.jacrtadministrationback.dto.in.AdministratorLoginInDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {

    @GetMapping("/login")
    public String login(AdministratorLoginInDTO administratorLoginInDTO){
        return null;
    }

    public

    @PostMapping("/updateProdfile")
    public void updateProdfile(){

    }

}
