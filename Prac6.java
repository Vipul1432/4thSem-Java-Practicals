import java.util.Scanner;

public class Prac6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your letter : ");
        char ch = sc.next().charAt(0);
        sc.close();
        switch (ch) {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.println("It is Vowel");
                break;

            default:
                System.out.println("It is consonant");
                break;
        }
    }
}