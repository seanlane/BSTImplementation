import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestBST1 {
	
	private BST<Integer> myTree;

	@Before
	public void setUp() throws Exception {
		myTree = new BST<Integer>();
	}
	
	@Test
	public void testLeastCommonAncestor() {
		Node<Integer> node1 = new Node<Integer>(10);
		Node<Integer> node2 = new Node<Integer>(9);
		
		assertTrue(myTree.findLeastCommonAncestor(node1, node2) == null);
		
		myTree.add(10);
		assertTrue(myTree.findLeastCommonAncestor(node1, node2) == null);
		
		myTree.remove(10);
		assertTrue(myTree.findLeastCommonAncestor(node1, node2) == null);
		
		myTree.add(9);
		assertTrue(myTree.findLeastCommonAncestor(node1, node2) == null);
		
		myTree.remove(9);
		assertTrue(myTree.findLeastCommonAncestor(node1, node2) == null);
		
		myTree.add(9);
		myTree.add(8);
		assertTrue(myTree.findLeastCommonAncestor(node1, node2) == null);
		
		myTree.add(10);
		assertTrue(myTree.findLeastCommonAncestor(node1, node2).getValue() == 9);
		assertTrue(myTree.findLeastCommonAncestor(node2, node1).getValue() == 9);
		assertTrue(myTree.findLeastCommonAncestor(node2, node2).getValue() == 9);
		assertTrue(myTree.findLeastCommonAncestor(node1, node1).getValue() == 10);
		
		myTree.add(9);
		myTree.add(8);
		myTree.add(10);
		assertTrue(myTree.findLeastCommonAncestor(node1, node2).getValue() == 9);
		
		myTree.add(7);
		myTree.add(6);
		myTree.add(5);
		myTree.add(4);
		myTree.add(3);
		myTree.add(2);
		node2 = new Node<Integer>(1);
		assertTrue(myTree.findLeastCommonAncestor(node1, node2) == null);
		
		node2 = new Node<Integer>(2);
		assertTrue(myTree.findLeastCommonAncestor(node1, node2).getValue() == 9);
		
		node1 = new Node<Integer>(6);
		assertTrue(myTree.findLeastCommonAncestor(node1, node2).getValue() == 6);
		
		myTree.add(106);
		myTree.add(103);
		myTree.add(101);
		myTree.add(100);
		myTree.add(102);
		myTree.add(105);
		myTree.add(104);
		myTree.add(108);
		myTree.add(107);
		myTree.add(110);
		myTree.add(109);
		
		node1 = new Node<Integer>(100);
		node2 = new Node<Integer>(102);		
		assertTrue(myTree.findLeastCommonAncestor(node1, node2).getValue() == 101);
		
		node1 = new Node<Integer>(100);
		node2 = new Node<Integer>(110);		
		assertTrue(myTree.findLeastCommonAncestor(node1, node2).getValue() == 106);
		
		node1 = new Node<Integer>(100);
		node2 = new Node<Integer>(111);		
		assertTrue(myTree.findLeastCommonAncestor(node1, node2) == null);
	}
	
	@Test
	public void testGetMin() {
		assertTrue(myTree.getMin() == null);
		
		myTree.add(10);
		assertTrue(myTree.getMin() == 10);
		
		myTree.remove(10);
		assertTrue(myTree.getMin() == null);
		
		myTree.add(10);
		assertTrue(myTree.getMin() == 10);
		
		myTree.add(9);
		myTree.add(8);
		myTree.add(10);
		myTree.add(9);
		myTree.add(8);
		myTree.add(10);
		assertTrue(myTree.getMin() == 8);
		
		myTree.add(100);
		myTree.add(18);
		myTree.add(17);
		myTree.add(32);
		myTree.add(11);
		myTree.add(10);
		assertTrue(myTree.getMin() == 8);
		
		myTree.remove(8);
		myTree.add(18);
		myTree.add(17);
		myTree.add(32);
		myTree.add(11);
		myTree.add(10);
		assertTrue(myTree.getMin() == 9);
		
		myTree.add(-106);
		myTree.add(107);
		myTree.add(-108);
		myTree.add(109);
		myTree.add(-110);
		myTree.add(100);
		myTree.add(-101);
		myTree.add(102);
		myTree.add(-103);
		myTree.add(104);
		myTree.add(-105);
		assertTrue(myTree.getMin() == -110);
	}

	@Test
	public void testGetMax() {
		assertTrue(myTree.getMax() == null);
		
		myTree.add(10);
		assertTrue(myTree.getMax() == 10);
		
		myTree.remove(10);
		assertTrue(myTree.getMax() == null);
		
		myTree.add(10);
		assertTrue(myTree.getMax() == 10);
		
		myTree.add(9);
		myTree.add(8);
		myTree.add(10);
		myTree.add(10);
		myTree.add(10);
		myTree.add(10);
		assertTrue(myTree.getMax() == 10);
		
		myTree.add(100);
		myTree.add(18);
		myTree.add(17);
		myTree.add(32);
		myTree.add(11);
		myTree.add(10);
		assertTrue(myTree.getMax() == 100);
		
		myTree.remove(100);
		myTree.add(18);
		myTree.add(17);
		myTree.add(32);
		myTree.add(11);
		myTree.add(10);
		assertTrue(myTree.getMax() == 32);
		
		myTree.add(-106);
		myTree.add(107);
		myTree.add(-108);
		myTree.add(109);
		myTree.add(-110);
		myTree.add(100);
		myTree.add(-101);
		myTree.add(102);
		myTree.add(-103);
		myTree.add(104);
		myTree.add(-105);
		assertTrue(myTree.getMax() == 109);
	}

}
