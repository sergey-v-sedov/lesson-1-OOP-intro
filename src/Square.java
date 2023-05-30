public class Square extends BaseFigure {

    public Square(int height, int width) {
        super(height, width);
        if(height != width) throw new IllegalArgumentException("Стороны квадрата должы быть равны!");
    }

    public void draw() {
        System.out.println("Квадрат " + height + " x " + width);
    }
}