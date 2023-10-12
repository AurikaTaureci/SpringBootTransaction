package com.example.SpringBootTransaction.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private int id;
    private String nameOwner;
    private double amount;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", nameOwner='" + nameOwner + '\'' +
                ", amount=" + amount +
                '}';
    }
}
