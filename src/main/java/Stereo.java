public class Stereo {

    String name;
    RecordPlayer recordPlayer;
    CDPlayer cdPlayer;
    Radio radio;



    public Stereo(String name, RecordPlayer recordPlayer, CDPlayer cdPlayer, Radio radio) {
        this.name = name;
        this.recordPlayer = recordPlayer;
        this.cdPlayer = cdPlayer;
        this.radio = radio;
    }

    public String getName() {
        return name;
    }

    public String tuneRadio(String station) {
        return this.radio.tune(station);
    }

    public String playCD (String song) {
        return this.cdPlayer.playSong(song);
    }

    public String playRecord(String song) {
        return this.recordPlayer.playSong(song);
    }
}
