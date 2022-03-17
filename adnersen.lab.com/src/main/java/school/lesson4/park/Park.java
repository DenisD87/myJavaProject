package school.lesson4.park;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private String parkName;
    private List<Attraction> attractions;

    private class Attraction {
        private String attractionName;
        private int workTimeMinutes;
        private int cost;

        public Attraction(String attractionName, int workTimeMinutes, int cost) {
            this.attractionName = attractionName;
            this.workTimeMinutes = workTimeMinutes;
            this.cost = cost;
        }

        public String getAttractionName() {
            return attractionName;
        }

        public int getWorkTimeMinutes() {
            return workTimeMinutes;
        }

        public int getCost() {
            return cost;
        }
    }

    public Park(String parkName) {
        this.parkName = parkName;
        this.attractions = new ArrayList<>();
    }

    public String getParkName() {
        return parkName;
    }

    public void setAttraction(String attractionName, int workTimeMinutes, int cost) {
        attractions.add(new Attraction(attractionName, workTimeMinutes, cost));
    }

    public void printParkInfo() {
        System.out.println(getParkName());
        for (Attraction attraction : attractions) {
            System.out.println(attraction.getAttractionName() + ", " + attraction.getWorkTimeMinutes() + " minutes, " + attraction.getCost());
        }
        System.out.println("------------------------------");
    }
}
