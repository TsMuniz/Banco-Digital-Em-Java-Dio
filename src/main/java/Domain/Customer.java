package Domain;

import java.time.LocalDate;

public class Customer {
  private String name;
  private String profession;
  private LocalDate bornDate;

  public Customer(String name, String profession, LocalDate bornDate) {
    this.name = name;
    this.profession = profession;
    this.bornDate = bornDate;
  }

  public String getName() {
    return name;
  }

  public String getProfession() {
    return profession;
  }

  public LocalDate getBornDate() {
    return bornDate;
  }

  @Override
  public String toString() {
    return "Customer{" +
            "name='" + name + '\'' +
            ", profession='" + profession + '\'' +
            ", bornDate=" + bornDate +
            '}';
  }
}
