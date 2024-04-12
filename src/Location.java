import java.util.*;

public class Location {
    private String name;
    private Map<Location, Integer> neighbors;

    public Location(String name) {
        this.name = name;
        this.neighbors = new HashMap<>();
    }

    public void addNeighbor(Location neighbor, int length) {
        this.neighbors.put(neighbor, length);
    }

    public Map<Location, Integer> getNeighbors() {
        return this.neighbors;
    }

    public String getName() {
        return this.name;
    }
}