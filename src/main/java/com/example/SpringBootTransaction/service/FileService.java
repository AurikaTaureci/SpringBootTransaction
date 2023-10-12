package com.example.SpringBootTransaction.service;

import com.example.SpringBootTransaction.model.Account;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class FileService {

    public void writeToFile(Account account)  {
        try {
            Files.write(Paths.get("account.txt"),account.toString().getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
