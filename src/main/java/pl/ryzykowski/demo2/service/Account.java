package pl.ryzykowski.demo2.service;

import java.math.BigDecimal;

public interface Account {

     public BigDecimal currentBalance();

     public BigDecimal deposit(BigDecimal ammount);

     public BigDecimal withdraw(BigDecimal ammount);

}
