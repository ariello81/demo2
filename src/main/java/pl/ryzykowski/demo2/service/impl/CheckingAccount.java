package pl.ryzykowski.demo2.service.impl;

import pl.ryzykowski.demo2.service.Account;

import java.math.BigDecimal;

public class CheckingAccount implements Account {

    private BigDecimal balance;

    public CheckingAccount(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public BigDecimal currentBalance() {
        return balance;
    }

    @Override
    public BigDecimal deposit(BigDecimal ammount) {
        this.balance = this.balance.add(ammount);
        return balance;
    }

    @Override
    public BigDecimal withdraw(BigDecimal ammount) {
        this.balance = this.balance.subtract(ammount);
        return balance;
    }

}
