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
    int x_pos = 0;
    int y_pos = 0;
    int x_speed = 1;
    int y_speed = 2;
    int d = 20;
    int width = BallRoom.WIDTH;
    int height = BallRoom.HEIGHT;

    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        if (x_pos < 0 || x_pos > width - d)
            x_speed = -x_speed;
        if (y_pos < 0 || y_pos > height - d)
            y_speed = -y_speed;
        x_pos += x_speed;
        y_pos += y_speed;

        Shape ball = new Ellipse2D.Float(
            x_pos, y_pos, d, d);
        g2.setColor(Color.RED);
        g2.fill(ball);
    }
}
