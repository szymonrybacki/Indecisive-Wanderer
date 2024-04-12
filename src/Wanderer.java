import java.util.*;

public class Wanderer {
    private Location currentLocation;
    private final Location wellLocation;
    private final Location exitLocation;

    public Wanderer(Park park) {
        this.currentLocation = park.getStart();
        this.wellLocation = park.getWell();
        this.exitLocation = park.getExit();
    }

    public void startWalking() {
        Random random = new Random();
        while (!currentLocation.getName().equals(wellLocation.getName()) && !currentLocation.getName().equals(exitLocation.getName())) {
            Set<Location> neighbors = currentLocation.getNeighbors().keySet();
            int index = random.nextInt(neighbors.size());
            currentLocation = (Location) neighbors.toArray()[index];
        }

        if (currentLocation.getName().equals(wellLocation.getName())) {
            System.out.println("Wędrowiec wpadł do studzienki kanalizacyjnej.");
        } else {
            System.out.println("Wędrowiec dotarł do wyjścia z parku.");
        }
    }
}