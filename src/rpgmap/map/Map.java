package rpgmap.map;

import rpgmap.tile.Tile;
import java.util.Random;

public abstract class Map {
    protected int width;
    protected int height;
    protected Tile[][] tiles;
    protected Random rand;  // ✅ must be protected, not private

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        this.rand = new Random();  // initialize here
        tiles = new Tile[height][width];
        generateMap();
    }

    protected abstract Tile createTile();

    private void generateMap() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                tiles[i][j] = createTile();
            }
        }
    }

    public void display() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(tiles[i][j].getCharacter() + " ");
            }
            System.out.println();
        }
    }
}
