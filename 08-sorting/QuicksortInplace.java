package Sorting;

public class QuicksortInplace {

	public static void main(String[] args) {
		int[] data = new int[]{3,5,6,2,1,8,4,9,0};
		sort(data,0,data.length-1);
		for(int n : data){
			System.out.println(n);
		}
	}

	private static void sort(int[] data, int left, int right){
		int pivot = (right+left)/2;
		int pivotVal = data[pivot];

		int i=left;
		int j=right;

		while(i<=j){
			while(data[i]<pivotVal){
				i++;
			}
			while(data[j]>pivotVal){
				j--;
			}

			if(i<=j){
				swap(data,i,j);
				i++;
				j--;
			}
		}

		if(left<j){
			sort(data,left,j);
		}
		
		if(i<right){
			sort(data,i,right);
		}


	}

	private static void swap(int[] data, int idx1, int idx2){
		int temp1 = data[idx1];
		int temp2 = data[idx2];
		data[idx1] = temp2;
		data[idx2] = temp1;
		//return data;
	}

}
