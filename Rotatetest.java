public class Rotatetest {
    public static void rotate(double[] x, double[] y, double theta) {
        double radians = Math.toRadians(theta);
        for (int i = 0; i < x.length; i++) {
            double b = x[i];
            x[i] = x[i] * Math.cos(radians) - y[i] * Math.sin(radians);
            y[i] = y[i] * Math.cos(radians) + b * Math.sin(radians);
        }
    }


    public static void main(String[] args) {
        StdDraw.setScale(-5.0, +5.0);
        double[] x = { 0, 1, 1, 0 };
        double[] y = { 0, 0, 2, 1 };

        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x, y);

        rotate(x, y, 45.0);

        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);
    }

}

