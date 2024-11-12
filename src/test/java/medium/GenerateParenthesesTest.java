package medium;

import com.gyakhoe.algomap.medium.GenerateParenthesesSolution;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GenerateParenthesesTest {

    private GenerateParenthesesSolution generateParenthesesSolution;
    private List<String> expectedResult;

    @BeforeEach
    void setUp() {
        generateParenthesesSolution = new GenerateParenthesesSolution();
        expectedResult = new ArrayList<>();
    }

    @AfterEach
    void tearDown() {
        generateParenthesesSolution = null;
        expectedResult = null;
    }

    @Test
    void testGenerateParenthesesWhenNIsZero() {
        int n = 0;
        expectedResult.add("");
        var result = generateParenthesesSolution.generateParentheses(n);
        assertEquals(result, expectedResult);


    }

    @Test
    void testGenerateParenthesesWhenNIsOne() {
        int n = 1;
        expectedResult.add("()");
        var result = generateParenthesesSolution.generateParentheses(n);
        assertTrue(result.containsAll(expectedResult) && expectedResult.containsAll(result));
        assertEquals(result.size(), expectedResult.size());
    }

    @Test
    void testGenerateParenthesesWhenNIsThree() {
        int n = 3;
        expectedResult.add("((()))");
        expectedResult.add("(()())");
        expectedResult.add("(())()");
        expectedResult.add("()(())");
        expectedResult.add("()()()");
        var result = generateParenthesesSolution.generateParentheses(n);
        assertEquals(expectedResult.size(), result.size());
        assertTrue(expectedResult.containsAll(result) && result.containsAll(expectedResult));


    }
}
