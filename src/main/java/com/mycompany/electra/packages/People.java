package com.mycompany.electra.packages;

public class People {
  /**
   * Caracteristicas.
   */
  private String name;
  private int age;
  private String profession;

  /**
   * Métodos.
   */
  public People setName(String name) {
    this.name = name;

    return this;
  }

  public People setAge(int age) {
    this.age = age;

    return this;
  }

  public People setProfession(String profession) {
    this.profession = profession;

    return this;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public String getProfission() {
    return this.profession;
  }

}
