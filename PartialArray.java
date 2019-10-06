//This loop collects inputs and fills up the value array
import java.util.Scanner;
Scanner in = new Scanner(System in);

final int LENGTH = 100
int currentSize = 0
double[] values = new double[LENGTH];
while(in.hasNextDouble())
{
	if (currentSize < values.length)
	{
		values[currentSize] = in.nextDouble();
		currentSize++;
	}
}

//To process the gathered array elements, use the companion variable - not array length
for (int i = 0; i < currentSize; i++)
{
	System.out.println(values[i]);
}
