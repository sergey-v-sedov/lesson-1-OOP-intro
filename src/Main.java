public class Main {
    public static void main(String[] args) {

        Square square = new Square(20, 20);
        Circle circle = new Circle(7, 7);
        Rectangle rectangle = new Rectangle(8, 6);

        BaseFigure[] figures = new BaseFigure[3];
        figures[0] = square;
        figures[1] = circle;
        figures[2] = rectangle;

        // =======================================

        for (int i = 0; i < figures.length; i++) {
            BaseFigure figure = figures[i];
            figure.draw();
            System.out.println("Цвет фигуры: " + figure.getColor());
        }


    }
}