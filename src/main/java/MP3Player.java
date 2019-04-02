public class MP3Player implements IConnect {

    public MP3Player() {

    }

    public String connect (Stereo stereo) {
        return stereo.getName();
    }
}
