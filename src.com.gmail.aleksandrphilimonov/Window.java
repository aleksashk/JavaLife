import javax.swing.*;

public class Window implements Runnable {
    JFrame frame;
    Box[][] boxes;//матрица для хранения организмов

    @Override
    public void run() {
        initFrame();
        initBoxes();
    }

    void initFrame() {
        frame = new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setSize(Config.SIZE * Config.WIDTH + 25, Config.SIZE * Config.HEIGHT + 45);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);//размещение окна по центру экрана
        frame.setVisible(true);
        frame.setTitle("Life Game");
    }

    void initBoxes() {
        boxes = new Box[Config.WIDTH][Config.HEIGHT];
        for (int x = 0; x < Config.WIDTH; x++) {
            for (int y = 0; y < Config.HEIGHT; y++) {
                boxes[x][y] = new Box(x, y);
                frame.add(boxes[x][y]);
            }
        }
//первые 2 for выбираем конкретную клетку на экране
//вокруг этой клетки проверяются все 8 клеток и каждую
//радомстоящую добавляем как соседа к основной в центре
        for (int x = 0; x < Config.WIDTH; x++) {
            for (int y = 0; y < Config.HEIGHT; y++) {
                for (int sx = -1; sx <= +1; sx++) {
                    for (int sy = -1; sy <= +1; sy++) {
                        if (!(sx == 0 && sy == 0)) {
                            boxes[x][y].cell.addNear(boxes[(x + sx + Config.WIDTH) % Config.WIDTH][(y + sy + Config.HEIGHT) % Config.HEIGHT].cell);
                        }
                    }
                }
            }
        }

        for (int x = 10; x < 15; x++) {
            boxes[x][10].cell.status = Status.LIVE;
        }
    }
}
