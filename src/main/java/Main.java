import Domain.Account;
import Domain.Customer;
import Domain.Savings;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Customer thiago = new Customer(
            "thiago",
            "Developer",
            LocalDate.of(1993,4,16));
    Customer verilene = new Customer(
            "verilene",
            "Balconista",
            LocalDate.of(1995,1,26));
    Customer joselia = new Customer(
            "joselia",
            "Costureira",
            LocalDate.of(1963,12,9));


    Account contaThiago = new Savings(thiago, 2000.0);
    Account contajosi= new Savings(joselia, 50000.0);
    Account contaVery = new Savings(verilene, 22000.0);

    System.out.println(contaThiago.getBalance());
    System.out.println(contaVery.getCustomer());
    System.out.println(contajosi.getAccountNumber());
  }

}
