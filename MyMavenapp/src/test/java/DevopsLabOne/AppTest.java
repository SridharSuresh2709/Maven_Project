package DevopsLabOne;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        App app = new App();
        String message = app.getmessage();
        assertEquals("Hello Sridhar!", message);
        System.out.println("Test passed: " +message);
    }
}
