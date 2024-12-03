package medium;

import com.gyakhoe.algomap.medium.MaxAreaIslandSolution;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxAreaIslandSolutionTest {

    private MaxAreaIslandSolution maxAreaIslandSolution;
    private int[][] grid;

    @BeforeEach
    void setUp() {
        maxAreaIslandSolution = new MaxAreaIslandSolution();
    }

    @AfterEach
    void tearDown() {
        maxAreaIslandSolution = null;
    }

    @Test
    void maxAreaSixTest() {
        grid = new int[][] {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0},
        };
        var result = maxAreaIslandSolution.maxAreaOfIsland(grid);
        assertEquals(6, result);
    }

    @Test
    void maxAreaZeroTest() {
        grid = new int[][] {{0,0,0,0,0,0,0,0}};
        var result = maxAreaIslandSolution.maxAreaOfIsland(grid);
        assertEquals(0, result);
    }
}
