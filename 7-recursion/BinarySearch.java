package Recursion;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = new int[]{2,4,6,8,9,14,25,47,57,78};
		int idx = BinSearch(arr,arr.length,0,25);
		System.out.println("Index: " + idx);
	}

	private static int BinSearch(int[] arr, int len, int offset, int target){
		int idx = (len/2)+offset;
		
		if(len==1){
			idx=1+offset;
		}

		if(arr[idx]==target){
			return idx;
		}

		if(arr[idx]>target){
			//offset=0;
		}
		else if(arr[idx]<target){
			offset=offset+(len/2);
		}
		return BinSearch(arr,(len/2),offset,target);

	}


}
