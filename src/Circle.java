import java.util.Random;

public class Circle extends BaseFigure {
    public Circle(int height, int width) {
        super(height, width);
        if(height != width) throw new IllegalArgumentException("Длина и ширина окружности должы быть равны!");
    }

    public void draw() {
        System.out.println("Круг " + height + " x " + width);
    }
}