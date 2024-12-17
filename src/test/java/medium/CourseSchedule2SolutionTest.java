

package medium;

import com.gyakhoe.algomap.medium.CourseSchedule2Solution;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CourseSchedule2SolutionTest {

    private CourseSchedule2Solution courseSchedule2Solution;

    @BeforeEach
    void setUp() {
        courseSchedule2Solution = new CourseSchedule2Solution();
    }

    @AfterEach
    void tearDown() {
        courseSchedule2Solution = null;
    }


    @Test
    void testWithTwoCoursesNoCycle() {
        int numCourses = 2;
        int[][] prerequisites = {{1,0}};
        var result = courseSchedule2Solution.findOrder(numCourses, prerequisites);
        int[] expectedResult = {0,1};
        assertArrayEquals(result, expectedResult);
    }

    @Test
    void testWithFourCoursesNoCycle() {
        int numCourses = 4;
        int[][] prerequisites = {
                {1,0},
                {2,0},
                {3,1},
                {3,2},
        };
        var result = courseSchedule2Solution.findOrder(numCourses, prerequisites);
        int[] expectedResult = {0,2,1,3};
        assertArrayEquals(expectedResult, result);
    }




}
