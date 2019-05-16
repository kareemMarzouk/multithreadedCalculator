import java.util.Scanner;

public class Test 
{

	public static void main(String[] args) 
	{
		//read user input
				Scanner input = new Scanner(System.in);				
				
		//create tasks
		Addition printA = new Addition (0,0);
		Subtraction printB = new Subtraction(0,0);
		Multiplication printC = new Multiplication(0,0);
		Division printD = new Division(0,0);
		
		
		System.out.println("\nWelcome to the Multithreaded Calculator");
		
		//ask user
		System.out.println("\nEnter first number: ");
		int n1 = input.nextInt();
		printA.setN1(n1);
		printB.setN1(n1);
		printC.setN1(n1);
		printD.setN1(n1);
		
		System.out.println("\nEnter second number: ");
		int n2 = input.nextInt();
		printA.setN2(n2);
		printB.setN2(n2);
		printC.setN2(n2);
		printD.setN2(n2);
		
		
		//create threads and register tasks to threads
		Thread thread1 = new Thread (printA);
		Thread thread2 = new Thread (printB);
		Thread thread3 = new Thread (printC);
		Thread thread4 = new Thread (printD);
		
		//start threads
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
	}

}
