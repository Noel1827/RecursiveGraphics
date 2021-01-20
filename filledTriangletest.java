public class filledTriangletest {
    public static void filledTriangle(double x, double y, double length) {
        double x0, y0, x1, y1;
        x0 = x - (length / 2);
        x1 = x + (length / 2);
        y1 = y +;
        StdDraw.setPenColor(StdDraw.BLACK);
        double[] xp = { x, x0, x1, };
        double[] yp = { y, y1, y1, };
        StdDraw.filledPolygon(xp, yp);

    }

    // s * sqrt(3)/2
    public static void main(String[] args) {
        // int n = Integer.parseInt(args[0]);
        double length, x, y;
        length = Math.sqrt(3) / 2);
        x = 0.5;
        y = 0.5;
        filledTriangle(x, y, length);

    }
}
