package Domain;

public abstract class Account {
  private static final int agencyNumber = 1;
  protected int accountNumber;
  protected Customer customer;
  protected Double balance = 0.0;
  public static int getAgencyNumber() {
    return agencyNumber;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public Domain.Customer getCustomer() {
    return customer;
  }

  public Double getBalance() {
    return balance;
  }

  public Double deposit(Double value) {
   return balance += value;
  }
  public double withdraw(Double value) {
    return balance -= value;
  }
  public void transfer(Double value, Account destinationAccount) {
    this.withdraw(value);
    destinationAccount.deposit(value);
  }
}
