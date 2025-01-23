package medium;

import com.gyakhoe.algomap.medium.CloneGraphSolution;
import com.gyakhoe.util.Node;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CloneGraphTest {

    CloneGraphSolution cloneGraphSolution;

    @BeforeEach
    void setUp() {
        cloneGraphSolution = new CloneGraphSolution();
    }

    @AfterEach
    void tearDown() {
        cloneGraphSolution = null;
    }

    @Test
    void testWithFourNodes() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.neighbors.add(n2);
        n1.neighbors.add(n4);
        n2.neighbors.add(n1);
        n2.neighbors.add(n3);
        n3.neighbors.add(n2);
        n3.neighbors.add(n4);
        n4.neighbors.add(n3);
        n4.neighbors.add(n1);

        Node clonedNode = cloneGraphSolution.cloneGraph(n1);
        assertTrue(clonedNode.neighbors.containsAll(n1.neighbors) && n1.neighbors.containsAll(clonedNode.neighbors));
    }
}
