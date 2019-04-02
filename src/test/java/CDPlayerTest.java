import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer1;

    @Before
    public void before() {
        cdPlayer1 = new CDPlayer("bec","beccy", 10);
    }

    @Test
    public void canGetProperties() {
        assertEquals("bec",cdPlayer1.getMake());
        assertEquals("beccy",cdPlayer1.getModel());
        assertEquals(10,cdPlayer1.getCdCapacity());

    }

    @Test
    public void canPlaysong() {
        assertEquals("Playing: ABBA", cdPlayer1.playSong("ABBA"));
    }

}
