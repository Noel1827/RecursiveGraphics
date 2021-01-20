import java.awt.Color;

public class Art {
    // this function will be used to draw the circles
    private static void circle(double x, double y, double radius) {
        StdDraw.circle(x, y, radius);
    }

    // the recursion that makes draws the circles everywhere, dividing by 1.5
    private static void rotation(int n, double x, double y, double radius) {
        if (n < 0) return;
        // calls function circle
        circle(x, y, radius);
        // to eliminate magic number, 0.5 and 1.5 are now variables.
        double rot = 0.5;
        double number = 1.5;
        StdDraw.setPenColor(Color.red);
        rotation(n - 1, x + rot, y + rot, radius / number);
        StdDraw.setPenColor(Color.blue);
        rotation(n - 1, -x + rot, -y + rot, radius / number);
        StdDraw.setPenColor(Color.red);
        rotation(n - 1, -x + rot, y + rot, radius / number);
        StdDraw.setPenColor(Color.blue);
        rotation(n - 1, x + rot, -y + rot, radius / number);
    }

    public static void main(String[] args) {
        // command line argument
        int n = Integer.parseInt(args[0]);

        // clear the screen and set the scale
        StdDraw.clear(StdDraw.BLACK);
        StdDraw.setScale(-3.5, 4.5);
        double x = 0;
        double y = 0;
        double radius = 0.90;

        // calls the rotation function
        rotation(n, x, y, radius);
    }
}
