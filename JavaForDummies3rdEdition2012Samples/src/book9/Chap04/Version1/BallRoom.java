import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.util.concurrent.*;

public class BallRoom extends JApplet
{
    public static final int WIDTH = 350;
    public static final int HEIGHT = 300;

    private PaintSurface canvas;

    public void init()
    {
        this.setSize(WIDTH, HEIGHT);
        canvas = new PaintSurface();
        this.add(canvas, BorderLayout.CENTER);

        ScheduledThreadPoolExecutor executor =
            new ScheduledThreadPoolExecutor(3);
        executor.scheduleAtFixedRate(
            new AnimationThread(this),
            0L, 20L, TimeUnit.MILLISECONDS);
    }
}

class AnimationThread implements Runnable
{
    JApplet c;

    public AnimationThread(JApplet c)
    {
        this.c = c;
    }

    public void run()
    {
            c.repaint();
    }
}

class PaintSurface extends JComponent
{
    int x_pos = 0;     // the starting X position
    int y_pos = 150;   // the starting Y position
    int d = 20;        // the diameter of the ball

    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);

        x_pos += 1;    // move ball right one pixel

        Shape ball = new Ellipse2D.Float(
            x_pos, y_pos, d, d);
        g2.setColor(Color.RED);
        g2.fill(ball);
    }
}
