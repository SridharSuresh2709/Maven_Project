import org.junit.Test;
import static org.junit.Assert.*;

public class SampleFailingTest {
    @Test
    public void testShouldFail() {
        assertEquals(1, 2); // this will fail
    }
}
