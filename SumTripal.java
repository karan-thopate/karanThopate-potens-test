
class SumTripal {

	boolean findNo(int Z[], int arrSize, int sum)
	{
		int l, r;

		for (int i = 0; i < arrSize - 2; i++)
		{
			for (int j = i + 1; j < arrSize - 1; j++)
			{
				for (int k = j + 1; k < arrSize; k++)
				{
					if (Z[i] + Z[j] + Z[k] == sum)
					{
						System.out.print("3 values  " + Z[i] + ", " + Z[j] + ", " + Z[k]);
						return true;
					}
				}
			}
		}

		return false;
	}

	public static void main(String[] args)
	{
		SumTripal triplet = new SumTripal();
		int Z[] = { 1, 2, 6, 9, 3 };
		int sum = 13;
		int arrSize = Z.length;

		triplet.findNo(Z, arrSize, sum);
	}
}


