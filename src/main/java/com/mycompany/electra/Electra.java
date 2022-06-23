package com.mycompany.electra;

import com.mycompany.electra.packages.User;

public class Electra {

  static User user;

  public static void main(String[] args) {
    user = new User();
    user.setName("Julio Junior");

    String[] name = user.getName().split(" ");
    System.out.println("O meu nome é: " + name[0]);
    System.out.println("O meu sobrenome é: " + name[1]);
  }

}
