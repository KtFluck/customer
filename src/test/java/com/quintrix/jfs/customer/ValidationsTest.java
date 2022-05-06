package com.quintrix.jfs.customer;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ValidationsTest {

  @Test
  public void validateEmailForAt() {
    Validations.validateEmail("Katie@fluck.com");

    assertTrue(Validations.validateEmail("Katie@fluck.com"));
  }

  @Test
  public void validateEmailForNoAt() {

    assertFalse(Validations.validateEmail("Katie"));
  }

}

