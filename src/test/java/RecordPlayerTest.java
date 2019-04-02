import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordPlayerTest {

    RecordPlayer recordPlayer1;

    @Before
    public void before() {
        recordPlayer1 = new RecordPlayer("rec","reccy", 45);
    }

    @Test
    public void canGetProperties() {
        assertEquals("rec",recordPlayer1.getMake());
        assertEquals("reccy",recordPlayer1.getModel());
        assertEquals(45,recordPlayer1.getPlayspeed());

    }

    @Test
    public void canPlaySong() {
        assertEquals("Playing: ABBA", recordPlayer1.playSong("ABBA"));
    }

}
