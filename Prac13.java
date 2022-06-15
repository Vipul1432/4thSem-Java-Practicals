import java.util.Scanner;
public class Prac13 {

	public static void main(String[] args) 
{
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter valid expression: ");
		String exp = input.nextLine();
		
		System.out.println("Your expression: "+exp);
		
		char op='1';
		double a=0;
		double b=0;
		double ans=0;
		
		String[] operands = exp.split("[\\+\\-\\*\\/]");
		a = Double.parseDouble(operands[0]);
		b = Double.parseDouble(operands[1]);
		
		op = exp.charAt(operands[0].length());
	
		switch(op) 
{
			case '+':ans=a+b;
			break;
			case '-':ans=a-b;
			break;
			case '*':ans=a*b;
			
break;
			case '/':ans=a/b;
			break;
		
}
		System.out.println("Answer: "+ans);
	}
}