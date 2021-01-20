public class Translatetest {

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


    public static void main(String[] args) {
        StdDraw.setScale(-5.0, +5.0);
        double[] x = { 0, 1, 1, 0 };
        double[] y = { 0, 0, 2, 1 };

        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x, y);

        translate(x, y, 2.0, 1.0);

        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);

    }
}
