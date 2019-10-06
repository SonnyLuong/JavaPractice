//Ch6: Removing an Element

double[] values = new double[10];
int currentSize = 10;
//If order doesn't matter:
values[pos] = values[currentSize - 1];
currentSize--;

//If order matters:
for (int i = pos + 1; i < currentSize; i++)
{
	values[i - 1] = values[i];
}
currentSize--;



//Inserting an Element

//if order doesn't matter:
if currentSize < values.length)
{
	currentSize++;
	values[currentSize - 1 = newElement;
}

//if order matters:
if (currentSize < values.length)
{
	currentSize++;
	for (int i = currentSize - 1; i > pos; i--)
	{
		values[i] = values[i - 1];
	}
	values[pos] = newElement;
}
