package oata;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class HelloWorldTest {

  @Test
  public void testHelloWorld() {
    assertNotNull("Hello World!");
  }

  @Test
  public void testFail() {
    fail("This should fail!");
  }
}
