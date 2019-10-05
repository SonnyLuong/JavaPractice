import java.util.Scanner;
/**
	This program prints the average salary values that are teriminated with a sentinel.
**/
public class Ch4SentinelDemo
{
	public static void main(String[] args)
	{
		double sum = 0;
		int count = 0;
		double salary = 0;
		System.out.print("Enter salaries here, -1 to finish: ");
		//Process data until the sentinel is entered
		while (salary != -1)
		{
			salary = in.nextDouble();
			if (salary != -1)
			{
				sum += salary;
				count++;
			}
		}
		
	//Compute and print the average
		if (count > 0)
		{
			double average = sum/count;
			System.out.print("The average is: " + average);
		}
		else 
		{
			System.out.println("No data");
		}
	}
}
