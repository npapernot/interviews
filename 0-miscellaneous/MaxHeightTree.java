package Trees;

public class MaxHeightTree {

	public static void main(String[] args) {
		Node root = new Node(5);
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(6);
		Node n6 = new Node(7);
		Node n7 = new Node(8);
		Node n8 = new Node(9);
		Node n9 = new Node(10);

		root.leftChild=n1;
		root.rightChild=n5;
		n1.rightChild=n3;
		n3.leftChild=n2;
		n2.rightChild=n4;
		n4.rightChild=n6;
		n6.rightChild=n9;
		n5.rightChild=n8;
		n8.leftChild=n7;
		
		maxHeight(root,0,0);
		
	}

	private static void maxHeight(Node root, int maxHeight, int curHeight){
		if(root.leftChild!=null){
			curHeight++;
			if(maxHeight<curHeight){
				maxHeight=curHeight;
			}
			System.out.println("MaxHeight " + maxHeight + " value " + root.value);
			maxHeight(root.leftChild,maxHeight,curHeight);
			curHeight--;
		}
		if(root.rightChild!=null){
			curHeight++;
			if(maxHeight<curHeight){
				maxHeight=curHeight;
			}
			System.out.println("MaxHeight " + maxHeight + " value " + root.value);
			maxHeight(root.rightChild,maxHeight,curHeight);
			curHeight--;
		}
	}
	


}
