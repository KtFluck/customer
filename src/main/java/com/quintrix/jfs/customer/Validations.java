package com.quintrix.jfs.customer;

public class Validations {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

  public static boolean validateEmail(String email) {

    if (email.contains("@")) {
      return true;
    }
    return false;
  }

}
