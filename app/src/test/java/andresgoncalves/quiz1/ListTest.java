package andresgoncalves.quiz1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Andres
 */
public class ListTest {
    @Test
    void appendElements() {
        List<Integer> list = new List<Integer>();
        list.append(1);
        list.append(2);
        list.append(3);
        assertEquals(3, list.getSize());
        assertEquals(1, list.getFirst().getValue());
        assertEquals(3, list.getLast().getValue());
    }
}
