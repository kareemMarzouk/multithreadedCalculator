public class Addition implements Runnable
{
	//variables
	int n1;
	int n2;
	
	//constructor
	public Addition(int n1, int n2) 
	{
		this.n1 = n1;
		this.n2 = n2;
	}
	
	
	//override to add
	@Override
	public void run() 
	{
		add(n1,n2);
		
	}


	//method of add()
	private void add(int n1, int n2) 
	{
		int sum = 0;
		
		synchronized (this) {
		
			for (int i = n1; i <= n2; i++)
			{
				sum = n1 + n2;
			}
			for (int i = n1; i >= n2; i++)
			{
				sum = n1 + n2;
			}
			System.out.println("\nSum of " + n1 + " and " + n2 + " is " + sum);
		}
		
	}

	

	//Getters and setter
	public int getN1() 
	{
		return n1;
	}


	public void setN1(int n1) 
	{
		this.n1 = n1;
	}


	public int getN2() 
	{
		return n2;
	}


	public void setN2(int n2) 
	{
		this.n2 = n2;
	}

}
