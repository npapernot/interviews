package Sorting;

public class Instertionsort {

	public static void main(String[] args) {
		int[] data = new int[]{4,5,7,3,6,1,2,9,8};
		data = sort(data);
		for(int n : data){
			System.out.println(n);
		}
	}
	
	private static int[] sort(int[] data){
		for(int i=1; i<data.length; i++){
			int val = data[i];
			for(int j=0; j<i; j++){
				if(data[j]>val){
					System.arraycopy(data, j, data, j+1, i-j);
					data[j]=val;
					break;
				}
			}
		}
		return data;
	}

}
