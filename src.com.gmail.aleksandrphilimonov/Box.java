import javax.swing.*;

public class Box extends JPanel {

    Cell cell;

    public Box(int x, int y) {
        super();
        cell = new Cell();
        //задаём координаты и размеры панели
        setBounds(x * Config.SIZE, y * Config.SIZE, Config.SIZE, Config.SIZE);
        setBackground(Config.getColor(Status.NONE));
    }

    public void initCells() {
    }

    public void setColor() {
        setBackground(Config.getColor(cell.status));
    }

    void step1() {
        cell.step1();
        setColor();
    }

    void step2() {
        cell.step2();
        setColor();
    }
}
