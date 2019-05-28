package UnivalTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnivalTreeTest {

    UnivalTree u = new UnivalTree<Integer>();
    UnivalTree<Integer> n = new UnivalTree<Integer>(0,
            new UnivalTree<Integer>(1), new UnivalTree<Integer>(0,
                new UnivalTree<Integer>(1,
                        new UnivalTree<Integer>(1), new UnivalTree<Integer>(1) ),
                new UnivalTree<Integer>(0)));

    @Test
    void univalSubTree() {
        assertEquals(u.univalSubTree(u.root), 0);
        assertEquals(n.univalSubTree(n.root), 5);
    }
}