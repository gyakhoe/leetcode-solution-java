package medium;

import com.gyakhoe.algomap.medium.RottingOranges;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RottingOrangesTest {

    private RottingOranges solution;

    @BeforeEach
    public void setUp() {
        // Initialize the solution instance before each test
        solution = new RottingOranges();
    }

    @AfterEach
    public void tearDown() {
        // Clean up after each test (if needed)
        solution = null;
    }

    @Test
    public void testExampleCase() {
        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };
        assertEquals(4, solution.orangesRotting(grid));
    }

    @Test
    public void testNoFreshOranges() {
        int[][] grid = {
                {2, 2, 0},
                {2, 2, 0},
                {0, 0, 0}
        };
        assertEquals(0, solution.orangesRotting(grid));
    }

    @Test
    public void testNoRottenOranges() {
        int[][] grid = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        assertEquals(-1, solution.orangesRotting(grid));
    }

    @Test
    public void testEmptyGrid() {
        int[][] grid = {};
        assertEquals(-1, solution.orangesRotting(grid));
    }

    @Test
    public void testSingleFreshOrange() {
        int[][] grid = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        assertEquals(-1, solution.orangesRotting(grid));
    }

    @Test
    public void testSingleRottenOrange() {
        int[][] grid = {
                {0, 0, 0},
                {0, 2, 0},
                {0, 0, 0}
        };
        assertEquals(0, solution.orangesRotting(grid));
    }
}
