package medium;

import com.gyakhoe.algomap.medium.CombinationSolution;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CombinationTest {

    private CombinationSolution combinationSolution;
    private List<List<Integer>> expectedResult;

    @BeforeEach
    void setUp() {
        combinationSolution = new CombinationSolution();
        expectedResult = new ArrayList<>();
    }

    @AfterEach
    void tearDown() {
        combinationSolution =  null;
        expectedResult = null;
    }

    @Test
    void testCombineWhenNIsFourAndKIsTwo() {
        int n = 4;
        int k = 2;
        expectedResult.add(Arrays.asList(2, 1));
        expectedResult.add(Arrays.asList(3, 1));
        expectedResult.add(Arrays.asList(3, 2));
        expectedResult.add(Arrays.asList(4, 1));
        expectedResult.add(Arrays.asList(4, 2));
        expectedResult.add(Arrays.asList(4, 3));

        var result = combinationSolution.combine(n, k);
//        assertEquals(expectedResult, result);
        assertEquals(result.size(), expectedResult.size());
        assertTrue(result.containsAll(expectedResult) && expectedResult.containsAll(result));
    }

    @Test
    void testCombineWhenNIsOneAndKIsOne() {
        int n = 1;
        int k = 1;
        expectedResult.add(List.of(1));
        var result = combinationSolution.combine(n, k );
        assertEquals(result.size(), expectedResult.size());
        assertTrue(result.containsAll(expectedResult) && expectedResult.containsAll(result));
    }
}
