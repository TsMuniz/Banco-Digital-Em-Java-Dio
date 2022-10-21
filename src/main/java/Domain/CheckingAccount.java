package Domain;

import java.time.LocalDate;

public class CheckingAccount extends Account{

  public CheckingAccount(int agencyNumber, int accountNumber, Domain.Customer customer, Double balance) {
    super(agencyNumber, accountNumber, customer, balance);
  }
}
