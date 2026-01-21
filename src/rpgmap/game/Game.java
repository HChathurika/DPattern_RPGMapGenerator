package rpgmap.game;

import rpgmap.map.*;

public class Game {

    // Factory method to create map
    public static Map createMap(String type, int width, int height) {
        if ("city".equalsIgnoreCase(type)) {
            return new CityMap(width, height);
        } else if ("wilderness".equalsIgnoreCase(type)) {
            return new WildernessMap(width, height);
        } else {
            throw new IllegalArgumentException("Unknown map type: " + type);
        }
    }

    public static void main(String[] args) {
        Map cityMap = createMap("city", 6, 6);
        System.out.println("The City Map:");
        cityMap.display();

        System.out.println();

        Map wildernessMap = createMap("wilderness", 5, 5);
        System.out.println("Wilderness Map:");
        wildernessMap.display();
    }
}

