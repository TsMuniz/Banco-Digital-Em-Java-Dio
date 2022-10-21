package Interface;

import Domain.Bank;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
  private Bank bank;

  public static void init() {
    Scanner input = new Scanner(System.in);
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

      menuOption = input.nextInt();
      switch (menuOption) {
        case 1 -> System.out.println("Você escolheu a opção" + menuOption);
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


}
