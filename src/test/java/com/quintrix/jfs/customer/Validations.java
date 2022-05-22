package com.quintrix.jfs.customer;

import java.util.List;

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

  public static boolean validList(List<String> strList) {
    if (strList != null && strList.size() > 100) {
      return true;
    }
    return false;
  }
}
