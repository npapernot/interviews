package Trees;

import java.util.Stack;

public class TraversalWithStack {

	public static void main(String[] args) {
		Node root = new Node(100);
		Node n1 = new Node(50);
		Node n2 = new Node(25);
		Node n3 = new Node(75);
		Node n4 = new Node(150);
		Node n5 = new Node(125);
		Node n6 = new Node(110);
		Node n7 = new Node(175);


		root.leftChild=n1;
		root.rightChild=n4;
		n1.leftChild=n2;
		n1.rightChild=n3;
		n4.leftChild=n5;
		n4.rightChild=n7;
		n5.leftChild=n6;
		
		traverse(root);

	}

	private static void traverse(Node root){
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		
		while(!stack.isEmpty()){
			Node node = stack.pop();
			System.out.println(node.value);
			if(node.rightChild!=null){
				stack.push(node.rightChild);
			}
			if(node.leftChild!=null){
				stack.push(node.leftChild);
			}
		}
	}
	
}
