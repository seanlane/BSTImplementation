
public class startClass
{
	public static void main(String args[])
	{
		BST<Integer> myTree = new BST<Integer>();
		
		System.out.println(myTree.printTree());
		
		myTree.add(24);
		myTree.add(22);
		myTree.add(23);
		myTree.add(26);
		myTree.add(27);
		myTree.add(29);
		
		
		System.out.println(myTree.printTree());
	}
}
