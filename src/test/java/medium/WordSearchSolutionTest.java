package medium;

import com.gyakhoe.algomap.medium.WordSearchSolution;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordSearchSolutionTest {

    private WordSearchSolution wordSearchSolution;
    private final char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
    };


    @BeforeEach
    void setUp() {
        wordSearchSolution = new WordSearchSolution();

    }

    @AfterEach
    void tearDown() {
        wordSearchSolution = null;
    }

    @Test
    void testWordSearchForFirstWord() {
        String word = "ABCCED";
        var result = wordSearchSolution.exist(board, word);
        assertTrue( result);
    }

    @Test
    void testWordSearchForSecondWord() {
        String word = "SEE";
        var result = wordSearchSolution.exist(board, word);
        assertTrue(result);
    }

    @Test
    void testWordSearchForThirdWord() {
        String word = "ABCB";
        var result = wordSearchSolution.exist(board, word);
        assertFalse(result);
    }
}
