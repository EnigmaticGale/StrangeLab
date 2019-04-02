public class RecordPlayer extends Component implements IPlay {

    int playspeed;



    public RecordPlayer(String make, String model, int playspeed) {
        super(make,model);
        this.playspeed = playspeed;

    }

    public int getPlayspeed() {
        return playspeed;
    }

    public String playSong(String song) {
        return "Playing: " + song;
    }
}
