package Interface;

import Domain.*;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
  private Bank bank;
  private static Scanner menuInput = new Scanner(System.in);

  public static void init() {
    int menuOption = 1;

    for (int i = 0; menuOption != 0; i++) {
      if(i == 0) {
        System.out.println("=========================");
        System.out.println("  Bem Vindo ao JavaBank");
        System.out.println("=========================");
      }

      System.out.println("Digite a opção desejada!\n");
      System.out.println("1-Cadastrar uma conta");
      System.out.println("2-Consultar Saldo");
      System.out.println("3-Sacar dinheiro");
      System.out.println("4-Depositar");
      System.out.println("5-Ver Extrato");
      System.out.println("0-Encerrar secao");

      menuOption = menuInput.nextInt();
      switch (menuOption) {
        case 1 -> createAccount();
        case 2 -> System.out.println("Você escolheu a opção" + menuOption);
        case 3 -> System.out.println("Você escolheu a opção" + menuOption);
        case 4 -> System.out.println("Você escolheu a opção" + menuOption);
        case 5 -> System.out.println("Você escolheu a opção" + menuOption);
        case 0 -> {
        }
        default -> {
          System.out.println("Opcao invalida! Tente novamente.");
        }
      }
    }
  }
  private static void createAccount() {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite seu nome");
    String name = input.next();
    System.out.println("Digite sua idade");
    int age = input.nextInt();
    System.out.println("Digite sua profissão");
    String profession = input.next();
    System.out.println("Informe o tipo de conta que quer criar.\n 1-corrente \n 2-poupança");
    Integer accountType = input.nextInt();


    Customer newCustomer = new Customer(name, profession, age);

    if(accountType.equals(1)) {
      Account newAccount = new CheckingAccount(newCustomer);
      Bank.save(newAccount);
    }else{
      Account newAccount = new Savings(newCustomer);
      Bank.save(newAccount);
    }

    System.out.println(Bank.getAccountList());

  }

}
