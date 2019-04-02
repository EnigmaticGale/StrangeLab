import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Radio radio;
    RecordPlayer recordPlayer;
    CDPlayer cdPlayer;
    Stereo stereo;

    @Before
    public void before() {
        recordPlayer = new RecordPlayer("rec","reccy", 45);
        cdPlayer = new CDPlayer("bec","beccy", 10);
        radio = new Radio();
        stereo = new Stereo("stupid", recordPlayer,cdPlayer,radio);
    }

    @Test
    public void canGetParemeters() {
        assertEquals("stupid",stereo.getName());
    }

    @Test
    public void canPlayManyABBASongs() {
        assertEquals("Playing: ABBA",stereo.playCD("ABBA"));
        assertEquals("Playing: ABBA",stereo.playRecord("ABBA"));
    }

    @Test
    public void canTuneRadio() {
        assertEquals("im tuning to station", stereo.tuneRadio("station"));
    }

}
