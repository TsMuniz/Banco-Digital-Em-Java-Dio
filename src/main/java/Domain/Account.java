package Domain;

public class Account {
  private int agencyNumber;
  private int accountNumber;
  private Customer Customer;
  private Double balance;

  public Account(int agencyNumber, int accountNumber, Domain.Customer customer, Double balance) {
    this.agencyNumber = agencyNumber;
    this.accountNumber = accountNumber;
    Customer = customer;
    this.balance = balance;
  }
}
