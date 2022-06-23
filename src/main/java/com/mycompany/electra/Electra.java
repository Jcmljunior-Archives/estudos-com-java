package com.mycompany.electra;

import com.mycompany.electra.packages.People;

public class Electra {
  static People people;

  public static void main(String[] args) {
    /**
     * Declarar pessoa.
     */
    people = new People();

    /**
     * Definir caracteristicas.
     */
    people
      .setName("Julio Cesar")
      .setAge(22)
      .setProfession("Ciencia e computação");

    /**
     * Imprimindo resultado.
     */
    System.out.format(
      "Nome: %s\nIdade: %d\nProfissão: %s\n",
      people.getName(),
      people.getAge(),
      people.getProfission()
    );
  }

}
