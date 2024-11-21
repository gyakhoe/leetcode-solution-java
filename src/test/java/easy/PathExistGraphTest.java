package easy;

import com.gyakhoe.algomap.easy.PathExistGraphSolution;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PathExistGraphTest {

    private PathExistGraphSolution pathExistGraphSolution;


    @BeforeEach
    void setUp() {
        pathExistGraphSolution = new PathExistGraphSolution();
    }

    @AfterEach
    void tearDown() {
        pathExistGraphSolution = null;
    }

    @Test
    void pathExistTrueTest() {
        int[][] edges = {
                {0, 1},
                {1, 2},
                {2, 0},
        };
        int source = 0;
        int destination = 2;
        var result = pathExistGraphSolution.validPath(3, edges, source, destination);
        Assertions.assertTrue(result);
    }

    @Test
    void pathExistFalseTest() {
        int[][] edges = {
                {0, 1},
                {0, 2},
                {3, 5},
                {5, 4},
                {4, 3},
        };
        int source = 0;
        int destination = 5;
        Assertions.assertFalse(pathExistGraphSolution.validPath(5, edges, source, destination));
    }
}
