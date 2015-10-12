package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeLinkedLevels {

	public static void main(String[] args) {
		NodeLinkTree root = new NodeLinkTree(4);
		NodeLinkTree n1 = new NodeLinkTree(1);
		NodeLinkTree n2 = new NodeLinkTree(2);
		NodeLinkTree n3 = new NodeLinkTree(3);
		NodeLinkTree n4 = new NodeLinkTree(5);
		NodeLinkTree n5 = new NodeLinkTree(6);
		NodeLinkTree n6 = new NodeLinkTree(7);

		root.leftChild=n2;
		root.rightChild=n5;
		n2.leftChild=n1;
		n2.rightChild=n3;
		n5.leftChild=n4;
		n5.rightChild=n6;
		
		linkNodes(root);

	}
	
	private static NodeLinkTree linkNodes(NodeLinkTree root){
		NodeLinkTree newRoot = root;
		Queue<NodeLinkTree> nodeQueue = new LinkedList<NodeLinkTree>();
		int curNodeLevel=0;
		int targetLevel=2;

		nodeQueue.add(root);

		while(!nodeQueue.isEmpty()){
			NodeLinkTree node = nodeQueue.poll();
			
			if(curNodeLevel==targetLevel){
				targetLevel=targetLevel*2;
				curNodeLevel=0;
			}
			else{
				node.rightNeighbor=nodeQueue.peek();
			}
		
			if(node.leftChild!=null){
				NodeLinkTree left = node.leftChild;
				nodeQueue.add(left);
			}
			if(node.rightChild!=null){
				NodeLinkTree right = node.rightChild;
				nodeQueue.add(right);
			}
			curNodeLevel++;
		}
		return newRoot;
		
	}

}
