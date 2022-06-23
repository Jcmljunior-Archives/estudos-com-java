package com.mycompany.electra.packages;

public class People implements PeopleInterface {
  private String name;
  private String profission;

  /**
   * Construtor.
   */
  public People(String name, String profission) {
    this.setName(name);
    this.setProfission(profission);
  }

  /**
   * Define o nome da pessoa.
   * @param name nome da pessoa.
   * @return People
   */
  public People setName(String name) {
    this.name = name;

    return this;
  }

  /**
   * Retorna o nome da pessoa.
   * @return nome da pessoa.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Define a profissão da pessoa.
   * @param profission Cargo de pessoa.
   * @return People
   */
  public People setProfission(String profission) {
    this.profission = profission;

    return this;
  }

  /**
   * Retorna a profissão de pessoa.
   * @return profissão pessoa.
   */
  public String getProfission() {
    return this.profission;
  }

}
