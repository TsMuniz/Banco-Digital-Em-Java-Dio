package Domain;

public class Savings extends Account{
  private static int sequencial = 1;
  public Savings(Domain.Customer customer, Double balance) {
    super.accountNumber = sequencial++;
    super.customer = customer;
    super.balance = balance;
  }
}
