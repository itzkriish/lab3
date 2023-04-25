import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2() {
    int[] input1 = { 0, 1 };
    ArrayExamples.reverseInPlace(input1);
    // error as it produces {1, 1} since it uses el at ind 0 which it has already changed
    assertArrayEquals(new int[]{ 1, 0 }, input1);
  }

  @Test
  public void testReversed2() {
    int[] input1 = { 1 };
    // error as it tries to assign a value from the new array which is empty to the old array
    // also returns original array
    assertArrayEquals(new int[]{ 1 }, ArrayExamples.reversed(input1));
  }
}
