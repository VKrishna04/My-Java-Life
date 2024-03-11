nodeimport org.junit.*;
import java.io.*;

public class MaxInArrayTest {
  @Test
  public void testMaxInArray() {
    // Simulate user input
    String input = "5\n1\n2\n3\n4\n5\n";
    System.setIn(new ByteArrayInputStream(input.getBytes()));

    // Capture the output
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    System.setOut(new PrintStream(output));

    // Run the main method
    MaxInArray.main(new String[0]);

    // Check the output
    String expectedOutput = "Please enter the size of array.\nPlease enter the element for the array.\nPlease enter the element for the array.\nPlease enter the element for the array.\nPlease enter the element for the array.\nPlease enter the element for the array.\n5\n";
    Assert.assertEquals(expectedOutput, output.toString());
  }
}