
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=6;i++)
		{
			
			for(int j=6-i;j>=1;j++)
			{
				
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				
				System.out.print("*");
			}
			
			
			System.out.println();

		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(" ");
			}
			for(int k=6-i;k>=1;k++)
			{
				
				System.out.print("*");
			}
			
			
			
			System.out.println();

		}

	}

}
