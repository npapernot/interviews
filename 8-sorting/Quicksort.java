package Sorting;

public class Quicksort {

	public static void main(String[] args) {
		int[] data = new int[]{3,5,6,2,1,8,4,9,0};
		data = sort(data,data.length);
		for(int n : data){
			System.out.println(n);
		}
	}

	private static int[] sort(int[] data, int len){
		if(len==1){
			return data;
		}
		else if(len==0){
			return new int[0];
		}

		int pivot = data[len/2];

		int smaller[] = new int[len];
		int larger[] = new int[len];

		int sCnt=0;
		int lCnt=0;
		for(int i=0; i<len; i++){
			if(data[i]<pivot){
				smaller[sCnt] = data[i];
						sCnt++;
			}
			else if(data[i]>pivot){
				larger[lCnt] = data[i];
						lCnt++;
			}
		}
		
		System.arraycopy(sort(smaller,sCnt), 0, data, 0, sCnt);
		data[sCnt]=pivot;
		System.arraycopy(sort(larger,lCnt), 0, data, sCnt+1, lCnt);
		
		return data;
	}


}
