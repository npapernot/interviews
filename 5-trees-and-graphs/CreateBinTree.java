package Trees;

public class CreateBinTree {

	public static void main(String[] args) {
		int[] values = new int[]{1,2,3,4,5,6,7};
		int start = 0;
		int end = values.length-1; //5
		Node binTree = createBinTree(values,start,end);
		System.out.println("Done!");
	}

	private static Node createBinTree(int[] values, int start, int end){
		int middle = start+((end-start)/2); // 4
		int rootValue = values[middle]; // 6

		Node root = new Node();
		root.value=rootValue; // 6
		if((middle-start)>0){ // 1
			root.leftChild=createBinTree(values,start,middle-1); //values,3,3
		}

		if((end-middle)>0){ //1
			root.rightChild=createBinTree(values,middle+1,end); //values,5,5
	}
		return root;
	}

	
}
