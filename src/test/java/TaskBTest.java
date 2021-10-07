import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskBTest {
    public static int[] array = TaskB.createArray();

    @Test
    void test1To30() {
        int n = TaskB.avg1_30(array);
        assertEquals(n, 10);
    }

    @Test
    void test31To60True() {
        boolean flag = true;
        for (int j : array) {
            if (j > 60 || j < 31) {
                flag = false;
                break;
            }
        }
        assertTrue(flag, "элемент неправильный!");
    }

}
