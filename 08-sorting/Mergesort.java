package Sorting;

public class Mergesort {

	public static void main(String[] args) {
		int[] data = new int[]{4,5,7,3,6,1,2,9,8};
		data = sort(data);
		for(int n : data){
			System.out.println(n);
		}
	}
	
	private static int[] sort(int[] data){
		
		if(data.length<2){
			return data;
		}
		
		int mid = data.length/2;
		int smaller[] = new int[mid];
		int larger[] = new int[data.length - mid];
		
		System.arraycopy(data,0,smaller,0,smaller.length);
		System.arraycopy(data,mid,larger,0,larger.length);
		
		smaller = sort(smaller);
		larger = sort(larger);
		
		return merge(data,smaller,larger);
	}
	
	private static int[] merge(int[] dest, int[] smaller, int[] larger){
		int sIdx=0;
		int lIdx=0;
		int dIdx=0;
		
		while(sIdx<smaller.length && lIdx<larger.length){
			if(smaller[sIdx]<=larger[lIdx]){
				dest[dIdx++]=smaller[sIdx++];
			}
			else{
				dest[dIdx++]=larger[lIdx++];
			}
		}
		
		while(sIdx<smaller.length){
			dest[dIdx++]=smaller[sIdx++];
		}
		
		while(lIdx<larger.length){
			dest[dIdx++]=larger[lIdx++];
		}
		
		return dest;
	}

}
