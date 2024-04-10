import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Practical8_q1 extends JPanel {
    private static final int PANEL_WIDTH = 200;
    private static final int PANEL_HEIGHT = 500;
    private static final String[] TEXTS = {"Java", "Java", "Java", "Java", "Java"};

    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Random random = new Random();

        for (int i = 0; i < TEXTS.length; i++) {

            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            float opacity = random.nextFloat();

            Font font = new Font("TimesRoman", Font.BOLD | Font.ITALIC, 22);
            g.setFont(font);

            g.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), (int) (255 * opacity)));

            int x = 50;
            int y = 50 + i * 80;
            Graphics2D g2d = (Graphics2D) g;
            g2d.rotate(Math.PI / 2, x, y);
            g2d.drawString(TEXTS[i], x, y);
            g2d.rotate(-Math.PI / 2, x, y);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Vertical Texts");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(PANEL_WIDTH, PANEL_HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.add(new Practical8_q1());
        frame.setVisible(true);
    }
}