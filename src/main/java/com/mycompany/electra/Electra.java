package com.mycompany.electra;

import com.mycompany.electra.packages.People;

public class Electra {
  
  public static void main(String[] args) throws Exception {
    /**
     * Valor padrão inserido via construtor.
     */
    String name = "Julio Cesar";
    String profission = "Programador";

    /**
     * Classe pessoa.
     */
    People people = new People(name, profission);

    /**
     * Imprimir valor padrão.
     */
    console(people);

    /**
     * Atualização de dados.
     */
    people.setName("João");
    people.setProfission("Padeiro");

    /**
     * Imprimir novo valor.
     */
    console(people);
  }

  public static void console(People people) {
    System.out.println(people.getName());
    System.out.println(people.getProfission());
  }

}
