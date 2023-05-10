import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

class containsA implements StringChecker {
    public boolean checkString(String s) {
        return s.contains("a");
    } 
}
public class ListTests {
	@Test 
    // bug -> adds element at 0 index so order is not the same
	public void testFilter() {
    List<String> input = new ArrayList<>();
    input.add("a"); input.add("ab"); input.add("c");
    List<String> expectedOutput = new ArrayList<>();
    expectedOutput.add("a"); expectedOutput.add("ab");
    assertEquals(ListExamples.filter(input, new containsA()), expectedOutput);
	}

    @Test
    // bug -> infinite loop caused by incrementing index 1 instead of 
    //        index 2 when adding leftover elements
    public void testMerge() {
        List<String> input1 = new ArrayList<>();
        input1.add("a"); input1.add("b"); input1.add("e");
        List<String> input2 = new ArrayList<>();
        input2.add("c"); input2.add("d"); input2.add("f");
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("a"); expectedOutput.add("b"); expectedOutput.add("c");
        expectedOutput.add("d"); expectedOutput.add("e"); expectedOutput.add("f");
        assertEquals(ListExamples.merge(input1, input2), expectedOutput);
    }
}
