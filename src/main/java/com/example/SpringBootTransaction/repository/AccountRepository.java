package com.example.SpringBootTransaction.repository;

import com.example.SpringBootTransaction.model.Account;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository {

    private final JdbcTemplate  jdbcTemplate;

    public AccountRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addAccount(Account account){
        final String sql="insert into account(nameOwner, amount) values(?,?)";
        jdbcTemplate.update(sql, account.getNameOwner(),account.getAmount());
    }
}
