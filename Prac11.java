public class Prac11 
{
		public static void main(String[] args)
		{
			int arr[][] = new int[6][6];
			int i,j;
			for(i=0;i<5;i++)
			{
				int cnt=0;
				for(j=0;j<5;j++)
				{
					arr[i][j] = (int)(Math.random() * 2);
					cnt += arr[i][j];
				}
				if(cnt % 2 == 0)
					arr[i][5]=1;
				else
					arr[i][j]=0;
			}
			System.out.println("\n\n");
			for(j=0;j<6;j++)
			{
				int cnt = 0;
				for(i=0;i<5;i++)
				{
					cnt+=arr[i][j];
				}
				if(cnt % 2 == 0)
					arr[i][j]=1;
				else
					arr[i][j]=0;
			}
			printArray(arr);
		}	
		public static void printArray(int[][] arr)
		{
			for(int i=0;i<6;i++)
			{
				for(int j=0;j<6;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
}		
