package Domain;

import java.time.LocalDate;

public class CheckingAccount extends Account{

  private static int sequencial = 1;
  public CheckingAccount(Domain.Customer customer) {
    super.accountNumber = sequencial++;
    super.customer = customer;

  }

  @Override
  public String toString() {
    return "CheckingAccount{" +
            "accountNumber=" + accountNumber +
            ", customer=" + customer +
            ", balance=" + balance +
            '}';
  }
}
