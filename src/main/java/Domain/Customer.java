package Domain;

import java.time.LocalDate;

public class Customer {
  private String name;
  private String profession;
  private int age;

  public Customer(String name, String profession, int age) {
    this.name = name;
    this.profession = profession;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public String getProfession() {
    return profession;
  }


  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Customer{" +
            "name='" + name + '\'' +
            ", profession='" + profession + '\'' +
            ",age=" + age +
            '}';
  }
}
