package medium;

import com.gyakhoe.algomap.medium.CombinationSolution;
import com.gyakhoe.algomap.medium.CombinationSumSolution;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CombinationSumTest {

    private CombinationSumSolution combinationSolution;
    private List<List<Integer>> expectedResult;

    @BeforeEach
    void setUp() {
        combinationSolution = new CombinationSumSolution();
        expectedResult = new ArrayList<>();
    }

    @AfterEach
    void tearDown() {
        combinationSolution = null;
        expectedResult = null;
    }

    @Test
    void testCombinationSumWhenTargetIsSeven() {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        expectedResult.add(List.of(7));
        expectedResult.add(Arrays.asList(2, 2, 3));

        var result = combinationSolution.combinationSum(candidates, target);
        assertTrue(expectedResult.containsAll(result) && result.containsAll(expectedResult));
    }



    @Test
    void testCombinationSumWhenTargetIsEight() {
        int[] candidates = {2, 3, 5};
        int target = 8;
        expectedResult.add(Arrays.asList(3, 5));
        expectedResult.add(Arrays.asList(2, 3, 3));
        expectedResult.add(Arrays.asList(2, 2, 2, 2));
        var result = combinationSolution.combinationSum(candidates, target);
        assertTrue(result.containsAll(expectedResult) && expectedResult.containsAll(result));
    }
    @Test
    void testCombinationSumWhenTargetIsOne() {
        int[] candidates = {2};
        int target = 1;
        var result = combinationSolution.combinationSum(candidates, target);
        assertTrue(expectedResult.containsAll(result) && result.containsAll(expectedResult));
    }
}
