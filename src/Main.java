import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Park park = new Park();
        park.addAlley(1, 2, 4);
        park.addAlley(2, 3, 4);
        park.addAlley(3, 4, 4);
        park.addAlley(4, 1, 4);
        park.addAlley(1, 3, 6);
        park.setWell(1);
        park.setExit(2, 2, 4);
        park.setStart(1, 3);

        Wanderer wanderer = new Wanderer(park);
        wanderer.startWalking();
    }
}

//indecisive wanderer
//hesitant wanderer
