import java.util.Scanner;

public class Prac3 {
    public static void main(String[] args) {
        System.out.print("Enter your meter value: ");
        Scanner sc = new Scanner(System.in);
        double meter = sc.nextDouble();
        double Feet = meter * 3.28084;
        System.out.println("Your feet value is: " + Feet);
        sc.close();
    }
}