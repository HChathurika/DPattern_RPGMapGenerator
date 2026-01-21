package rpgmap.map;

import rpgmap.tile.*;

public class WildernessMap extends Map {

    public WildernessMap(int width, int height) {
        super(width, height);  // rand is initialized in Map
    }

    @Override
    protected Tile createTile() {
        // Use the inherited rand from Map
        int choice = rand.nextInt(3);  // 0: Swamp, 1: Water, 2: Forest

        switch (choice) {
            case 0: return new SwampTile();
            case 1: return new WaterTile();
            default: return new ForestTile();
        }
    }
}
