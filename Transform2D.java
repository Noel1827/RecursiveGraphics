public class Transform2D {

    // Scales the polygon by the factor alpha.
    public static void scale(double[] x, double[] y, double alpha) {
        int i = 0;
        for (int j = 0; j < x.length; j++) {
            while (i <= j) {
                x[i] *= alpha;
                y[i] *= alpha;
                i++;
            }
        }
    }


    // Translates the polygon by (dx, dy).
    public static void translate(double[] x, double[] y, double dx, double dy) {
        int i = 0;
        for (int j = 0; j < x.length; j++) {
            while (i <= j) {
                x[i] += dx;
                y[i] += dy;
                i++;
            }
        }
    }

    // Returns a new array object that is an exact copy of the given array.
    // The given array is not mutated.
    public static double[] copy(double[] array) {
        double[] copy = new double[array.length];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = array[i];

        }
        return copy;
    }


    // Rotates the polygon theta degrees counterclockwise, about the origin.
    public static void rotate(double[] x, double[] y, double theta) {
        double radians = Math.toRadians(theta);
        for (int i = 0; i < x.length; i++) {
            double b = x[i];
            x[i] = x[i] * Math.cos(radians) - y[i] * Math.sin(radians);
            y[i] = y[i] * Math.cos(radians) + b * Math.sin(radians);
        }
    }

    // Tests each of the API methods by directly calling them.
    public static void main(String[] args) {
        // Set the x- and y-scale
        StdDraw.setScale(-5.0, 5.0);

        // Original polygon
        double[] x = { 0, 1, 1, 0 };
        double[] y = { 0, 0, 2, 1 };


        // Copy of original polygon
        double[] cx = Transform2D.copy(x);
        double[] cy = Transform2D.copy(y);
        for (int i = 0; i < cy.length; i++) {
            StdOut.println(cy[i]);

        }
        scale(cx, cy, 2.0);

        // Rotate, translate and draw the copy
        Transform2D.rotate(cx, cy, -45.0);
        Transform2D.translate(cx, cy, 1.0, 2.0);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(cx, cy);

        // Draw the original polygon
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x, y);
    }
}

