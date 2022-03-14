package school.lesson4.park;

public class ParkMainApp {
    public static void main(String[] args) {
        Park park = new Park("Park pobeditelei");

        park.setAttraction("Ferris wheel", 10, 5);
        park.setAttraction("Carousel", 7, 4);
        park.setAttraction("Roller coaster", 5, 15);

        park.printParkInfo();
    }
}
