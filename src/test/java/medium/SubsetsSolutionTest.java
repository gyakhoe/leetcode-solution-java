package medium;

import com.gyakhoe.algomap.medium.SubsetsSolution;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.util.Arrays;
import java.util.List;

public class SubsetsSolutionTest {

    private SubsetsSolution solution;

    @BeforeEach
    public void setUp() {
        solution = new SubsetsSolution();
    }

    @AfterEach
    public void tearDown() {
        solution = null;
    }

    @Test
    public void testSubsetsWithZeroElement() {
        int[] nums = {};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList()
        );
        List<List<Integer>> result = solution.subsets(nums);
        assertTrue(result.containsAll(expected) && expected.containsAll(result));
    }


    @Test
    public void testSubsetsWithTwoElements() {
        int[] nums = {1, 2};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(),
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(1, 2)
        );
        List<List<Integer>> result = solution.subsets(nums);
        assertTrue(result.containsAll(expected) && expected.containsAll(result));
    }


}
