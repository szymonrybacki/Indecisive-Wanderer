import java.util.*;

public class Park {
    private Map<Integer, Location> crossroads;
    private Location well;
    private Location exit;
    private Location start;

    public Park() {
        this.crossroads = new HashMap<>();
    }

    public void addAlley(int i, int j, int length) {
        Location locationI = crossroads.getOrDefault(i, new Location("Crossroad " + i));
        Location locationJ = crossroads.getOrDefault(j, new Location("Crossroad " + j));

        // Assuming that the alley is a two-way road
        locationI.addNeighbor(locationJ, length);
        locationJ.addNeighbor(locationI, length);

        crossroads.put(i, locationI);
        crossroads.put(j, locationJ);
    }

    public void setWell(int i) {
        this.well = crossroads.get(i);
    }

    public void setExit(int i, int j, int length) {
        this.exit = crossroads.get(i);
        // Assuming that the exit is at the end of an alley
        Location exitLocation = new Location("Exit");
        exitLocation.addNeighbor(this.exit, length);
        this.exit.addNeighbor(exitLocation, length);
    }

    public void setStart(int i, int j) {
        this.start = crossroads.get(i);
        // If the start is in the middle of an alley
        if (j != 0) {
            Location startLocation = new Location("Start");
            startLocation.addNeighbor(this.start, j);
            this.start.addNeighbor(startLocation, j);
            this.start = startLocation;
        }
    }

    public Location getWell() {
        return this.well;
    }

    public Location getExit() {
        return this.exit;
    }

    public Location getStart() {
        return this.start;
    }
}