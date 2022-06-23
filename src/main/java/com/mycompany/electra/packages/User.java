package com.mycompany.electra.packages;

public class User extends People implements UserInterface {
  
  String username;
  String password;

  public User setUsername(String username) {
    this.username = username;

    return this;
  }
  
  public User setPassword(String password) {
    this.password = password;

    return this;
  }

}
