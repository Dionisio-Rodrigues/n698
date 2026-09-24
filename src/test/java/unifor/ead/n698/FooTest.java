package unifor.ead.n698;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FooTest {
    private static final int SLEEP_TIME = 1000;

    @Test
    void fooDoSomethingOneTest() throws InterruptedException {
        Thread.sleep(SLEEP_TIME);
        assertEquals(true, true);
    }

    @Test
    void fooDoSomethingTwoTest() throws InterruptedException{
        Thread.sleep(SLEEP_TIME);
        assertEquals(true, true);
    }

    @Test
    void fooDoSomethingThreeTest() throws InterruptedException{
        Thread.sleep(SLEEP_TIME);
        assertEquals(true, true);
    }

    @Test
    void fooDoSomethingFourTest() throws InterruptedException{
        Thread.sleep(SLEEP_TIME);
        assertEquals(true, true);
    }

    @Test
    void fooDoSomethingFiveTest() throws InterruptedException{
        Thread.sleep(SLEEP_TIME);
        assertEquals(true, true);
    }

    // @Test
    // void fooDoSomethingDontPassTest() throws InterruptedException{
    //     Thread.sleep(SLEEP_TIME);
    //     assertEquals(false, true);
    // }
}
