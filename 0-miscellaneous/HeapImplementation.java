package Heap;

public class HeapImplementation {

	private static int[] heaparr = new int[1];

	public static void main(String[] args) {
		insert(6);
		insert(7);
		insert(12);
		insert(10);
		insert(15);
		insert(17);
		insert(5);
		delete(5);
	}

	private static void insert(int value){
		heaparr = addEntry(heaparr);
		int pos = heaparr.length-1;
		heaparr[pos]=value;

		//perculate
		while(heaparr[pos/2]>heaparr[pos]){
			int t1 = heaparr[pos/2];
			int t2 = heaparr[pos];
			heaparr[pos/2]=t2;
			heaparr[pos]=t1;
			pos=pos/2;
		}
	}

	private static void delete(int value){
		int pos=1;
		for(int i=0; i<heaparr.length; i++){
			if(value==heaparr[i]){
				pos=i;
				break;
			}
		}

		heaparr[pos] = heaparr[heaparr.length-1];

		while(heaparr[pos*2]<heaparr[pos] || heaparr[pos*2+1]<heaparr[pos]){
			if(heaparr[pos*2]<heaparr[pos*2+1]){
				int temp = heaparr[pos*2];
				heaparr[pos*2] = heaparr[pos];
				heaparr[pos] = temp;
				pos=pos*2;
			}
			else{
				int temp = heaparr[pos*2+1];
				heaparr[pos*2+1] = heaparr[pos];
				heaparr[pos] = temp; 
				pos=pos*2+1;
			}
		}
		heaparr = removeEntry(heaparr);
	}

	private static int[] addEntry(int[] heaparr){
		int cursize = heaparr.length;
		int[] newHeaparr = new int[cursize+1];
		for(int i=0; i<cursize; i++){
			newHeaparr[i]=heaparr[i];
		}
		return newHeaparr;
	}
	
	private static int[] removeEntry(int[] heaparr){
		int cursize = heaparr.length;
		int[] newHeaparr = new int[cursize-1];
		for(int i=0; i<cursize-1; i++){
			newHeaparr[i]=heaparr[i];
		}
		return newHeaparr;
	}

}
