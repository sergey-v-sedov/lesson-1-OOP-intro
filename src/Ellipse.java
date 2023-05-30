public class Ellipse extends BaseFigure {
    public Ellipse(int height, int width) {
        super(height, width);
    }

    public void draw() {
        System.out.println("Овал " + height + " x " + width);
    }
}