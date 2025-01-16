package medium;

import com.gyakhoe.algomap.medium.PacificAtlanticWaterFlowSolution;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PacificAtlanticWaterFlowTest {

    PacificAtlanticWaterFlowSolution pacificAtlanticWaterFlowSolution;
    List<List<Integer>> expectedFlow;

    @BeforeEach
    void setUp() {
        pacificAtlanticWaterFlowSolution = new PacificAtlanticWaterFlowSolution();
        expectedFlow = new ArrayList<>();
    }

    @AfterEach
    void tearDown() {
        pacificAtlanticWaterFlowSolution = null;
        expectedFlow = null;
    }

    @Test
    void testForValidFlow() {
        int[][] heights = {
            {1,2,2,3,5},
            {3,2,3,4,4},
            {2,4,5,3,1},
            {6,7,1,4,5},
            {5,1,1,2,4},
        };
        expectedFlow.add(Arrays.asList(0,4));
        expectedFlow.add(Arrays.asList(1,3));
        expectedFlow.add(Arrays.asList(1,4));
        expectedFlow.add(Arrays.asList(2,2));
        expectedFlow.add(Arrays.asList(3,0));
        expectedFlow.add(Arrays.asList(3,1));
        expectedFlow.add(Arrays.asList(4,0));

        var result = pacificAtlanticWaterFlowSolution.pacificAtlantic(heights);
        assertEquals(result.size(),  expectedFlow.size());
        assertTrue(result.containsAll(expectedFlow) && expectedFlow.containsAll(result));
    }

    @Test
    void noValidFlow() {
        int[][] heights = {{1}};
        var result = pacificAtlanticWaterFlowSolution.pacificAtlantic(heights);
        expectedFlow.add(Arrays.asList(0,0));
        assertEquals(result.size(),  expectedFlow.size());
        assertTrue(result.containsAll(expectedFlow) && expectedFlow.containsAll(result));
    }


}
