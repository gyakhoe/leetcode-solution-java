package medium;

import com.gyakhoe.algomap.medium.LetterCombinationPhoneNumberSolution;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LetterCombinationPhoneNumberTest {

    private LetterCombinationPhoneNumberSolution letterCombinationPhoneNumberSolution;
    private List<String> expectedList;

    @BeforeEach
    void setUp() {
        letterCombinationPhoneNumberSolution = new LetterCombinationPhoneNumberSolution();
        expectedList = new ArrayList<>();
    }

    @AfterEach
    void tearDown() {
        letterCombinationPhoneNumberSolution = null;
        expectedList = null;
    }

    @Test
    void testLetterCombinationPhoneNumberWithZeroDigits() {
        String digits = "";
        var result = letterCombinationPhoneNumberSolution.letterCombinationString(digits);
        assertTrue(result.isEmpty());
    }

    @Test
    void testLetterCombinationPhoneNumberWithOneDigits() {
        String digits = "2";
        expectedList.add("a");
        expectedList.add("b");
        expectedList.add("c");

        var result = letterCombinationPhoneNumberSolution.letterCombinationString(digits);
        assertEquals(result.size(), expectedList.size());
        assertTrue(result.containsAll(expectedList) && expectedList.containsAll(result));


    }

    @Test
    void testLetterCombinationPhoneNumberWithTwoDigits() {
        String digits = "23";
        expectedList.add("ad");
        expectedList.add("ae");
        expectedList.add("af");
        expectedList.add("bd");
        expectedList.add("be");
        expectedList.add("bf");
        expectedList.add("cd");
        expectedList.add("ce");
        expectedList.add("cf");

        var result = letterCombinationPhoneNumberSolution.letterCombinationString(digits);
        assertEquals(expectedList.size(), result.size());
        assertTrue(result.containsAll(expectedList) && expectedList.containsAll(result));
    }
}
