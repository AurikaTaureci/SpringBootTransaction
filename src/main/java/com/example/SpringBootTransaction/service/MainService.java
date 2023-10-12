package com.example.SpringBootTransaction.service;

import com.example.SpringBootTransaction.model.Account;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MainService {
    private final AccountService accountService;
    private final FileService fileService;


    public MainService(AccountService accountService, FileService fileService) {
        this.accountService = accountService;
        this.fileService = fileService;
    }

    @Transactional
    public void saveAccontInAllSystem(Account account){
        accountService.addAccount(account);
        fileService.writeToFile(account);
    }
}
