
//Ch. 6.3
public class Main
{
	public static double[] printArray(double[] text)
	{
		return text;
	}
	public static void main(String[] args)
	{
		final int LENGTH = 10;
		double[] values = new double[LENGTH];

		//Filling
		for (int i = 0; i < values.length; i++)
		{
			values[i] = i * i;
		}
		System.out.println("Original Array: ");
		System.out.println(values);
		printArray(values);
		//Sum and Average Value
		double total = 0;
		for (double element : values)
		{
			total = total + element;
		}
		double average = 0;
		if (values.length > 0)
		{
			average = total/values.length;
		}
		System.out.println("Sum and Average Value: ");
		printArray(values);
		System.out.println(total + ", " + average);
		//Max and Min
		double largest = values[0];
		for (int i = 1; i < values.length; i++)
		{
			if (values[i] > largest)
			{
				largest = values[i];
			}
		}
		System.out.println("Max/Min: ");
		System.out.println(largest);
		printArray(values);
		//Element Separators
		for (int i = 0; i < values.length; i++)
		{
			if (i > 0)
			{
				System.out.print(" | ");
			}
			System.out.print(values[i]);
		}
		System.out.println("Element Separators: ");
		printArray(values);
		//Linear Search
		int searchedValue = 100;
		int pos = 0;
		boolean found = false;
		while (pos < values.length && !found)
		{
			if (values[pos] == searchedValue)
			{
				found = true;
			}
			else
			{
				pos++;
			}
		}
		System.out.println("Linear Search: ");
		printArray(values);
		//Removing an Element
		for (int i = pos + 1; i < currentSize; i++)
		{
			values[i - 1] = values[i];
		}
		currentSize--;
		System.out.println("Removing an Element: ");
		printArray(values);
	}
}
