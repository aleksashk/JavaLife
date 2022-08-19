import javax.swing.*;
import java.awt.*;

public class Box extends JPanel {
    public Box(int x, int y) {
        super();

        //задаём координаты и размеры панели
        setBounds(x * Config.SIZE, y * Config.SIZE, Config.SIZE, Config.SIZE);
        setBackground(Color.BLUE);
    }
}
