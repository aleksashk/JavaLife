import javax.swing.*;

public class Window implements Runnable {
    JFrame frame;

    @Override
    public void run() {
        initFrame();
    }

    void initFrame() {
        frame = new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);//размещение окна по центру экрана
        frame.setVisible(true);
        frame.setTitle("Life Game");
    }
}
