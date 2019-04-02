import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio1;

    @Before
    public void before() {
        radio1 = new Radio();
    }

    @Test
    public void canTune() {
        assertEquals("im tuning to station",radio1.tune("station"));
    }


}
