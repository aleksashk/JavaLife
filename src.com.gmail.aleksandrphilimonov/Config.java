import java.awt.*;

public class Config {
    public static final int SIZE = 10;// размер одной ячейки
    public static final int WIDTH = 80;// ширина поля
    public static final int HEIGHT = 60;// высота поля
    public static final int SLEEPMS = 100;

    //метод определяет цвета
    public static Color getColor(Status status) {
        switch (status) {
            default:
            case NONE:
                return Color.BLACK;
            case BORN:
                return Color.GRAY;
            case LIVE:
                return Color.WHITE;
            case DIED:
                return Color.BLUE;
        }
    }

}
