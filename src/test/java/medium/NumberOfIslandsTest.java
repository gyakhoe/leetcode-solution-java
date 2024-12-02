package medium;

import com.gyakhoe.algomap.medium.NumberOfIslandsSolution;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfIslandsTest {

    private NumberOfIslandsSolution numberOfIslandsSolution;
    private char[][] grid;

    @BeforeEach
    void setUp() {
        numberOfIslandsSolution = new NumberOfIslandsSolution();
    }

    @AfterEach
    void tearDown() {
        numberOfIslandsSolution = null;
    }

    @Test
    void numberOfIslandsOneTest() {
        grid = new char[][]{
                {'1','1','1','1', '0'},
                {'1','1','0','1', '0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'},
        };
        var result = numberOfIslandsSolution.numIslands(grid);
        assertEquals(1, result);
    }

    @Test
    void numberOfIslandsThreeTest() {
        grid = new char[][]{
                {'1','1','0','0', '0'},
                {'1','1','0','0', '0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'},
        };
        var result = numberOfIslandsSolution.numIslands(grid);
        assertEquals(3, result);
    }






}
