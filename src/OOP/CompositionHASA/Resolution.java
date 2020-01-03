package OOP.CompositionHASA;

/* resolution class is part of monitor, monitor is not a resolution
*  but has a resolution, so that's where the composition comes in
*  part of object */

public class Resolution {
    private int width;
    private int height;

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
