public class Rectangle extends BaseFigure {

    public Rectangle(int height, int width) {
        super(height, width);
    }

    public void draw() {
        System.out.println("Прямоугольник " + height + " x " + width);
    }
}
