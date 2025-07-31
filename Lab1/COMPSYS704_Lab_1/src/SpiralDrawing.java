import javax.swing.*;
import java.awt.*;

public class SpiralDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        int sides = 8;
        int total_side = 18;
        double angleStep = 2 * Math.PI / sides;

        int baseLength = 30;  // length of first side
        int lengthStep = 5;  // increase length each side

        // Starting point
        int xPrev = centerX;
        int yPrev = centerY;

        double currentAngle = -Math.PI / 2; // start pointing upwards

        for (int i = 0; i < total_side; i++) {
            int sideLength = baseLength + i * lengthStep;

            // Calculate next point coordinates
            int xNext = xPrev + (int) (sideLength * Math.cos(currentAngle));
            int yNext = yPrev + (int) (sideLength * Math.sin(currentAngle));

            // Draw line from previous point to next point
            g.drawLine(xPrev, yPrev, xNext, yNext);

            // Update for next iteration
            xPrev = xNext;
            yPrev = yNext;

            // Rotate angle by 45 degrees (octagon angle step)
            currentAngle += angleStep;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Open Octagon Spiral");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.add(new SpiralDrawing());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
