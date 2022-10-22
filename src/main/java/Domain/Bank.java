package Domain;

import java.util.ArrayList;
import java.util.List;

public class Bank {
  private static List<Customer> customerList = new ArrayList<>();
  private static List<Account> accountList = new ArrayList<>();

  public List<Customer> getCustomerList() {
    return customerList;
  }

  public static boolean getAccountList() {
    for(Account account: accountList) {
      System.out.println(account);
    };
    return false;
  }

  public static void save(Account account) {
    accountList.add(account);
  }
}
