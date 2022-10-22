package Domain;

public class Savings extends Account{
  private static int sequencial = 1;
  public Savings(Domain.Customer customer) {
    super.accountNumber = sequencial++;
    super.customer = customer;
  }

  @Override
  public String toString() {
    return "Savings{" +
            "accountNumber=" + accountNumber +
            ", customer=" + customer +
            ", balance=" + balance +
            '}';
  }
}
