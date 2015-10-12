package Trees;

import java.util.Stack;

public class LowestCommonAncestor {
	public static void main(String[] args) {
		Node root = new Node(20);
		Node n1 = new Node(8);
		Node n2 = new Node(22);
		Node n3 = new Node(4);
		Node n4 = new Node(12);
		Node n5 = new Node(10);
		Node n6 = new Node(14);


		root.leftChild=n1;
		root.rightChild=n2;
		n1.leftChild=n3;
		n1.rightChild=n4;
		n4.leftChild=n5;
		n4.rightChild=n6;
		
		lowestCommonAncestor(root,4,14);

	}
	
	private static void lowestCommonAncestor(Node root, int v1, int v2){
		if(root.value < v1 && root.value < v2){
			lowestCommonAncestor(root.rightChild,v1,v2);
		}
		if(root.value > v1 && root.value > v2){
			lowestCommonAncestor(root.leftChild,v1,v2);
		}
		if(root.value > v1 && root.value < v2){
			System.out.println(root.value);
		}
	}
	
	
}
