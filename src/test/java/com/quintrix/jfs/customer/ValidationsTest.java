package com.quintrix.jfs.customer;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class ValidationsTest {

  @Mock
  List<String> strList;

  @Test
  public void validateEmailForAt() {
    Validations.validateEmail("Katie@fluck.com");

    assertTrue(Validations.validateEmail("Katie@fluck.com"));
  }

  @Test
  public void validateEmailForNoAt() {

    assertFalse(Validations.validateEmail("Katie"));
  }

  @Test
  void validateListNegitiveCase() {
    List<String> strList = new ArrayList<>();
    assertFalse(Validations.validList(strList));
  }

  @Test
  void validateListPositiveCase() {

    List<String> strListMock = Mockito.mock(List.class);
    Mockito.when(strListMock.size()).thenReturn(120);
    assertTrue(Validations.validList(strListMock));


  }
}

