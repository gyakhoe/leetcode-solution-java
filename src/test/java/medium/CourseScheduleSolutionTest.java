package medium;

import com.gyakhoe.algomap.medium.CourseScheduleSolution;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CourseScheduleSolutionTest {

    private  CourseScheduleSolution courseScheduleSolution;


    @BeforeEach
    void setUp() {
        courseScheduleSolution = new CourseScheduleSolution();
    }

    @AfterEach
    void tearDown() {
        courseScheduleSolution = null;
    }


    @Test
    void courseScheduleFalseTest() {
        int numberOfCourses = 2;
        int[][] prerequisites = new int[][] {
                {1, 0},
                {0, 1},
        };
        var result = courseScheduleSolution.canFinish(numberOfCourses, prerequisites);
        assertFalse(result);

    }

    @Test
    void courseScheduleTrueTest() {
        int numberOfCourse = 2;
        int[][] prerequisites = new int[][] {
                {1, 0}
        };
        var result = courseScheduleSolution.canFinish(numberOfCourse, prerequisites);
        assertTrue(result);
    }
}
