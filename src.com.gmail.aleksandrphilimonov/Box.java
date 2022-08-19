import javax.swing.*;
import java.awt.*;

public class Box extends JPanel {
    public Box(int x, int y) {
        super();
        setBounds(x * Config.SIZE, y * Config.SIZE, Config.SIZE, Config.SIZE);//задаём координаты и размеры панели
        setBackground(Color.BLUE);
    }
}
