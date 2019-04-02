import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MP3Test {

    MP3Player mp3Player;
    Radio radio;
    RecordPlayer recordPlayer;
    CDPlayer cdPlayer;
    Stereo stereo;

    @Before
    public void before () {
        recordPlayer = new RecordPlayer("rec","reccy", 45);
        cdPlayer = new CDPlayer("bec","beccy", 10);
        radio = new Radio();
        stereo = new Stereo("stupid", recordPlayer,cdPlayer,radio);
        mp3Player = new MP3Player();
    }

    @Test
    public void canConnect(){
        assertEquals("stupid", mp3Player.connect(stereo));
    }
}
