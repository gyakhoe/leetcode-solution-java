package medium;

import com.gyakhoe.algomap.medium.PermutationSolution;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PermutationSolutionTest {

    private PermutationSolution permutationSolution;
    private List<List<Integer>> expectedPermuation;


    @BeforeEach
    void setUp() {
        permutationSolution = new PermutationSolution();
        expectedPermuation = new ArrayList<>();
    }

    @AfterEach
    void tearDown() {
        permutationSolution = null;
        expectedPermuation = null;
    }

    @Test
    void testPermuteWithThreeElements() {
        int[] nums  = {1, 2, 3};
        expectedPermuation.add(Arrays.asList(1, 2, 3));
        expectedPermuation.add(Arrays.asList(1, 3, 2));
        expectedPermuation.add(Arrays.asList(2, 1, 3));
        expectedPermuation.add(Arrays.asList(2, 3, 1));
        expectedPermuation.add(Arrays.asList(3, 1, 2));
        expectedPermuation.add(Arrays.asList(3, 2, 1));

        List<List<Integer>> result = permutationSolution.permute(nums);
        assertEquals(result.size(), expectedPermuation.size());
        assertTrue(result.containsAll(expectedPermuation) && expectedPermuation.containsAll(result));
    }

    @Test
    void testPermuteWithTwoElements() {
        int[] nums = {1, 2};
        expectedPermuation.add(Arrays.asList(1, 2));
        expectedPermuation.add(Arrays.asList(2, 1));

        var result = permutationSolution.permute(nums);
        assertEquals(result.size(), expectedPermuation.size());
        assertTrue(result.containsAll(expectedPermuation) && expectedPermuation.containsAll(result));
    }

    @Test
    void testPermuteWithZeroElement() {
        int [] nums  = {};
        expectedPermuation.add(new ArrayList<>());

        var result = permutationSolution.permute(nums);
        assertEquals(result.size(), expectedPermuation.size());
        assertTrue(result.containsAll(expectedPermuation) && expectedPermuation.containsAll(result));
    }
}
