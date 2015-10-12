package Trees;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinHeightTree {

	public static void main(String[] args) {
		Queue<Node> searchQueue = new LinkedList<Node>();
		
		Node root = new Node(1);
		Node a = new Node(2);
		Node b = new Node(3);
		Node c = new Node(4);
		Node d = new Node(5);
		Node e = new Node(6);
		Node f = new Node(7);
		Node g = new Node(8);

		root.leftChild=a;
		root.rightChild=b;
		
		a.leftChild=null;
		a.rightChild=f;
		f.leftChild=g;
		
		b.leftChild=c;
		
		searchQueue.add(root);

		System.out.println(getSmallestLeaf(searchQueue));
		
		
	}

	private static int getSmallestLeaf(Queue<Node> searchQueue){
		int levelNodes=2;
		int prevLevelNodes=1;
		int level=0;
	 
		while(!searchQueue.isEmpty()){
			Node node = searchQueue.remove();
			prevLevelNodes--;

			if(prevLevelNodes==0){
				prevLevelNodes=levelNodes;
				levelNodes=0;
				level++;
			}
			
			if(node.leftChild!=null){
				Node l = node.leftChild;
				searchQueue.add(l);
				levelNodes++;
			}

			if(node.rightChild!=null){
				Node r = node.rightChild;
				searchQueue.add(r);
				levelNodes++;
			}

			if(node.leftChild==null && node.rightChild==null){
				return level;
			}
		}
		return -1;
	} 

	
	
}
