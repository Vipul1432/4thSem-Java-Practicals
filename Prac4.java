import java.util.Scanner;

public class Prac4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in pound: ");
        double m = sc.nextDouble();
        System.out.print("Enter your height in inch: ");
        double h = sc.nextDouble();
        double BMI = (m * 45359237) / (h * h * 0.0254);
        System.out.println("Your BMI is " + BMI);
        sc.close();
    }
}