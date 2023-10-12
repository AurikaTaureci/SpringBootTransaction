package com.example.SpringBootTransaction.service;

import com.example.SpringBootTransaction.model.Account;
import com.example.SpringBootTransaction.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void addAccount(Account account){
        accountRepository.addAccount(account);
        throw new RuntimeException();
    }
}
