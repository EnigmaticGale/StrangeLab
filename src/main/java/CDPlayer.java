public class CDPlayer extends Component {

    int cdCapacity;



    public CDPlayer(String make, String model, int cdCapacity) {
        super(make,model);
        this.cdCapacity = cdCapacity;

    }

    public int getCdCapacity() {
        return cdCapacity;
    }

    public String playSong(String song) {
        return "Playing: " + song;
    }
}
