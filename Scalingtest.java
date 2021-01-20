public class Scalingtest {

    public static void scale(double[] x, double[] y, double alpha) {
        for (int i = 0; i < x.length; i++) {
            x[i] *= alpha;
            y[i] *= alpha;

        }
    }


    public static void main(String[] args) {

        StdDraw.setScale(-5.0, +5.0);
        double[] x = { 0, 1, 1, 0 };
        double[] y = { 0, 0, 2, 1 };

        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x, y);

        scale(x, y, 2.0);

        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);
    }

}

