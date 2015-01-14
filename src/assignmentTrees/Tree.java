package assignmentTrees;

import java.util.Scanner;

public class Tree {
	public static void printTree(TreeNode root) throws QueueEmptyException{
		if(root == null){
			return;
		}
		Queue<TreeNode> queue = new Queue<TreeNode>();
		queue.enqueue(root);

		while(!queue.isEmpty()){
			TreeNode currentNode = queue.dequeue();
			String toBePrinted = currentNode.data + ":";
			for(int i = 0; i < currentNode.children.size(); i++){
				queue.enqueue(currentNode.children.get(i));
				toBePrinted = toBePrinted + currentNode.children.get(i).data + ", ";
			}
			System.out.println(toBePrinted);
		}

	}

	public static TreeNode takeInput() throws QueueEmptyException{
		Queue<TreeNode> queue = new Queue<TreeNode>();
		TreeNode root = new TreeNode();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the root = ");
		root.data = s.nextInt();
		queue.enqueue(root);
		while(!queue.isEmpty()){
			TreeNode currentNode = queue.dequeue();
			System.out.println("Enter the number of children of " + currentNode.data);
			int numChildren = s.nextInt();
			for(int i = 0; i < numChildren; i++){
				System.out.println("Enter the data for the " + i + "th child = ");
				int childData = s.nextInt();
				TreeNode child = new TreeNode();
				child.data = childData;
				currentNode.children.add(child);
				queue.enqueue(child);
			}

		}

		return root;
	}
}
