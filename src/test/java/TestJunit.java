import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestJunit {
  @Test

  public void testAdd() {
    String str = "Junit is working fine";
    assertEquals("Junit is working fine", str);
  }

}
