package pl.ryzykowski.demo2.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class CheckingAccountTest {


    private CheckingAccount checkingAccount;

    private final BigDecimal startValue = new BigDecimal(2.5);

    @BeforeEach
    public void before() {
        checkingAccount = new CheckingAccount(startValue);
    }


    @Test
    void currentBalance_shouldReturnPositiveBalance() {
        //given

        //when
        checkingAccount.currentBalance();

        //then
        Assertions.assertEquals(new BigDecimal(2.5),
                checkingAccount.currentBalance());
    }

    @Test
    void deposit_shouldDepositPositiveValue() {
        //given
        final BigDecimal depositValue = new BigDecimal(3.0);

        //when
        checkingAccount.deposit(depositValue);

        //then
        Assertions.assertEquals(new BigDecimal(5.5),
                checkingAccount.currentBalance());
    }

    @Test
    void withdraw_shouldWithdrawPositiveValue() {
        //given
        final BigDecimal subtractValue = new BigDecimal(2.0);

        //when
        checkingAccount.withdraw(subtractValue);

        //then
        Assertions.assertEquals(new BigDecimal (0.5),
                checkingAccount.currentBalance());

    }
}