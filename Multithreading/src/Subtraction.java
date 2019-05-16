public class Subtraction extends Addition
{

	public Subtraction(int n1, int n2) 
	{
		super(n1, n2);
	}
	
	//override to add
		@Override
		public void run() 
		{
			subtract(n1,n2);
			
		}


		//method of subtract()
		private void subtract(int n1, int n2) 
		{
			int sum = 0;
			
				for (int i = n1; i <= n2; i++)
				{
					sum = n1 - n2;
				}
				
				for (int i = n1; i >= n2; i++)
				{
					sum = n1 - n2;
				}
				System.out.println("\nSubtraction of " + n1 + " and " + n2 + " is " + sum);

}
}
