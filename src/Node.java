public class Node<E extends Comparable<E>> 
{
	private Node<E> leftChild;
	private Node<E> rightChild;
	
	private E value;
	
	public Node(E valueIn){
		this.value = valueIn;
	}
	
	public Node<E> getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(Node<E> leftChild) {
		this.leftChild = leftChild;
	}
	public Node<E> getRightChild() {
		return rightChild;
	}
	public void setRightChild(Node<E> rightChild) {
		this.rightChild = rightChild;
	}
	public E getValue(){
		return this.value;
	}
	public void setValue(E valueIn) {
		this.value = valueIn;
	}
}
