package Domain;

import java.time.LocalDate;

public class CheckingAccount extends Account{
  private String name;
  private String profession;
  private LocalDate bornDate;
  private Account account;

  public CheckingAccount(String name, String profession, LocalDate bornDate, Account account) {
    this.name = name;
    this.profession = profession;
    this.bornDate = bornDate;
    this.account = account;
  }
}
