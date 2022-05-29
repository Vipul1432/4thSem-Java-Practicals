import java.util.Scanner;

public class Prac10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter ten numbers : ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();
        reverse(numbers);

        for (int e : numbers) {
            System.out.print(e + " ");
        }
        System.out.println();
        input.close();
    }

    public static void reverse(int[] list) {
        int temp;
        for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
            temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
    }
}