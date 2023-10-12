package com.example.SpringBootTransaction.controller;

import com.example.SpringBootTransaction.model.Account;
import com.example.SpringBootTransaction.service.MainService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MainController {

    private final MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @PostMapping("/add")
    public void addAccount(@RequestBody Account account){
        mainService.saveAccontInAllSystem(account);
    }
}
