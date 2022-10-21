package Domain;

import java.time.LocalDate;

public class CheckingAccount extends Account{

  private static int sequencial = 1;
  public CheckingAccount(Domain.Customer customer, Double balance) {
    super.accountNumber = sequencial++;
    super.customer = customer;
    super.balance = balance;

  }
}
