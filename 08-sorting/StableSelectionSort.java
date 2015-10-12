package Sorting;

import java.util.LinkedList;

public class StableSelectionSort {

	public static void main(String[] args) {
		int[] data = new int[]{1,2,3,2,1};
		//data = sort(data);
		for(int n : data){
			System.out.println(n);
		}
		
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();

		
	}
/**
	private static LinkedList<Integer> sort(LinkedList<Integer> data){
		int tempdata[] = new int[data.length];
		for(int i=0; i<data.length; i++){
			int idx = findMinIdx(i,data);
			
			data = swap(data,i,findMinIdx(i,data));
		}
		return data;
	}
	**/
	
	private static LinkedList<Integer> insert(LinkedList<Integer> data, int src, int dst){
		data.set(dst, data.get(src));
		return data;
	}
	
	private static int findMinIdx(int start, LinkedList<Integer> data){
		int minpos = start;
		for(int i=start+1; i<data.size(); i++){
			if(data.get(i)<data.get(minpos)){
				minpos=i;
			}
		}
		return minpos;
	}
	
}
