
public class BST<E extends Comparable<E>>
{
	// --- Members
	
	private Node<E> rootNode;
	
	// --- Public Methods
	
	// BST Set 1
	
	public E getMax() {
		if(rootNode == null)
			return null;
		else
			return recursiveGetMax(rootNode);
	}
	
	public E getMin() {
		if(rootNode == null)
			return null;
		else
			return recursiveGetMin(rootNode);
	}
	
	public Node<E> findLeastCommonAncestor(Node<E> node1, Node<E> node2) {
		if(rootNode == null)
			return null;
		else if(!this.contains(node1.getValue()) || !this.contains(node2.getValue()))
			return null;
		else
			return recursiveLCA(rootNode, node1.getValue(), node2.getValue());
	}
	
	// BST Set 0

	public void add(E valueIn){
		if(rootNode == null)
			rootNode = new Node<E>(valueIn);
		else
			recursiveInsert(rootNode, valueIn);
	}
	
	public boolean contains(E value){
		if(rootNode == null)
			return false;			
		else
			return recursiveFind(rootNode, value) != null;
	}
	
	public void remove(E value) {
		rootNode = recursiveRemove(rootNode, value);
		
	}
	
	// --- Private Methods
	
	private Node<E> recursiveLCA(Node<E> node, E value1, E value2) {
		// This node is value1 or value2, must be the LCA
		if(	node.getValue() == value1 || 
			node.getValue() == value2 )
			return node;
		// This node is between value1 and value2, must be the LCA
		else if(value1.compareTo(node.getValue()) < 0 &&
				value2.compareTo(node.getValue()) > 0)
			return node;
		// This node is between value2 and value1, must be the LCA
		else if(value1.compareTo(node.getValue()) > 0 &&
				value2.compareTo(node.getValue()) < 0)
			return node;
		// Both are smaller, LCA must be down to the left farther
		else if(value1.compareTo(node.getValue()) < 0 &&
				value2.compareTo(node.getValue()) < 0) 
		{
			if(node.getLeftChild() == null)
				return null;
			else
				return recursiveLCA(node.getLeftChild(), value1, value2);
		}
		// Both are bigger, LCA must be down to the right farther
		else
		{
			if(node.getRightChild() == null)
				return null;
			else
				return recursiveLCA(node.getRightChild(), value1, value2);
		}
	}
	
	private E recursiveGetMax(Node<E> node){
		if(node.getRightChild() == null)
			return node.getValue();
		else
			return recursiveGetMax(node.getRightChild());
	}
	
	private E recursiveGetMin(Node<E> node){
		if(node.getLeftChild() == null)
			return node.getValue();
		else
			return recursiveGetMin(node.getLeftChild());
	}
	
	private Node<E> recursiveRemove(Node<E> toDelete, E value) {
		if(toDelete == null)
			return null;
		
		int compareValue = value.compareTo(toDelete.getValue());
		
		if(compareValue < 0) // ValueIn is smaller
		{
			toDelete.setLeftChild(recursiveRemove(toDelete.getLeftChild(), value));
			return toDelete;
		}
		else if(compareValue > 0) // ValueIn is bigger
		{
			toDelete.setRightChild(recursiveRemove(toDelete.getRightChild(), value));
			return toDelete;
		}
		else // Values are equal, return true
			if(toDelete.getLeftChild() == null && toDelete.getRightChild() == null)
				return null;
			else if(toDelete.getLeftChild() != null && toDelete.getRightChild() == null)
				return toDelete.getLeftChild();
			else if (toDelete.getLeftChild() == null && toDelete.getRightChild() != null)
				return toDelete.getRightChild();
			else {
				Node<E> temp = getSmallestNode(toDelete.getRightChild());
				toDelete.setValue(temp.getValue());
				temp = null;
				return toDelete;				
			}
	}
	
	private Node<E> getSmallestNode(Node<E> nodeIn) {
		if(nodeIn.getLeftChild() == null)
			return nodeIn;
		else 
			return getSmallestNode(nodeIn.getLeftChild()); 
	}
	
	private Node<E> recursiveFind(Node<E> node, E valueIn) {
		
		int compareValue = valueIn.compareTo(node.getValue());
		
		if(compareValue < 0) // ValueIn is smaller
		{
			if(node.getLeftChild() == null)
				return null;
			else
				return recursiveFind(node.getLeftChild(), valueIn);
		}
		else if(compareValue > 0) // ValueIn is bigger
		{
			if(node.getRightChild() == null)
				return null;
			else
				return recursiveFind(node.getRightChild(), valueIn);
		}
		else // Values are equal, return true
			return node;
	}
	
	private void recursiveInsert(Node<E> node, E valueIn) {
		
		int compareValue = valueIn.compareTo(node.getValue());
		
		if(compareValue < 0) // ValueIn is smaller
		{
			if(node.getLeftChild() == null)
				node.setLeftChild(new Node<E>(valueIn));
			else
				recursiveInsert(node.getLeftChild(), valueIn);
		}
		else if(compareValue > 0) // ValueIn is bigger
		{
			if(node.getRightChild() == null)
				node.setRightChild(new Node<E>(valueIn));
			else
				recursiveInsert(node.getRightChild(), valueIn);
		}
		else // Values are equal, return
			return;
	}
	
	private String recursivePrint(Node<E> c, int depth)
	{
		String result = "";
		if( c != null)
		{
			//Data // For convenience, place data to print out before calling out the right and left
			for(int i=0; i < depth; i++)
			{
				result += "*";
			}
			result += c.getValue() + "\n";

			//Left
			result += recursivePrint(c.getLeftChild(), depth + 1);

			//Right
			result += recursivePrint(c.getRightChild(), depth + 1);
		}
		return result;
	}
	
	public String printTree() {
		if(rootNode == null)
			return "Empty";
		else
			return recursivePrint(rootNode, 0);
	}
}

