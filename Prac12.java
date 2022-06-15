import java.util.Random;
import java.util.Arrays;
public class Prac12
{
		public static void main(String[] args)
		{
			int min = 1;
			int max = 49;
			Random randomNum = new Random(1000);
			//System.out.println(Arrays.toString(randomNum.ints(100,1,49).toarray()));
			for (int i =1; i<=100;i++) 
			{
				System.out.print(min  + randomNum.nextInt(max) + " ");
			}
		}
}
