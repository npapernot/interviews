
public class FindNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[]{8,4,12,0,7,3,1};
		findMissing(array);
	}

	public static void findMissing(int array[])
	{
		for (int i = 0; i < array.length; ) 
		{
			if (array[i] < array.length && array[i] != i)
			{
				int temp = array[array[i]];
				array[array[i]] = array[i];
				array[i] = temp;
			}
			else 
				i++;
		}

		//check 0 to n-1
		for (int i = 0; i < array.length; i++) {
			if (array[i] != i){
				System.out.print(i + " ");
			}
		}

		//sort n to 2*n-1
		for (int i = 0; i < array.length; ) {
			if (array[i] >= array.length && array[i] != i + array.length)
			{
				int temp = array[array[i] - array.length];
				array[array[i] - array.length] = array[i];
				array[i] = temp;
			}
			else
				i++;
		}

		//check n to 2*n-1
		for (int i = 0; i < array.length; i++) {
			if (array[i] != i + array.length)
			{
				System.out.print(i + array.length + " ");
			}
		}
	}

}
