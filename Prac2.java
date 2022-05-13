public class Prac2 {
    public static void main(String[] args) {
        System.out.println("The equation is 1) 3.4x+50.2y=44.5 2) 2.1x+.55y=5.9");
        double a = 3.4, b = 50.2, e = 44.5, c = 2.1, d = 0.55, f = 5.9;

        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        System.out.println("The value of x is " + x);
        System.out.println("The value of y is " + y);

    }
}