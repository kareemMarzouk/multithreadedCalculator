public class Division extends Multiplication
{
	public Division(int n1, int n2) 
	{
		super(n1, n2);
	}
	
	//override to multiply
		@Override
		public void run() 
		{
			subtract(n1,n2);
			
		}


		//method of multiply()
		private void subtract(int n1, int n2) 
		{
			int sum = 0;
			
				for (int i = n1; i <= n2; i++)
				{
					sum = n1 / n2;
				}
				for (int i = n1; i >= n2; i++)
				{
					sum = n1 / n2;
				}
				System.out.println("\nDivision of " + n1 + " and " + n2 + " is " + sum);

		}


}
