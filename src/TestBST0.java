

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestBST0 {

	public BST<Integer> myTree;
	
	@Before
	public void initialize(){
		myTree = new BST<Integer>();
		myTree.add(106);
		myTree.add(107);
		myTree.add(108);
		myTree.add(109);
		myTree.add(110);
		myTree.add(100);
		myTree.add(101);
		myTree.add(102);
		myTree.add(103);
		myTree.add(104);
		myTree.add(105);
	}
	
	@Test
	public void testContains() {
		assertTrue(myTree.contains(100));
		assertTrue(myTree.contains(107));
		assertTrue(myTree.contains(110));
		
		assertFalse(myTree.contains(99));
		assertFalse(myTree.contains(1000));
		assertFalse(myTree.contains(000));
		assertFalse(myTree.contains(001));
		assertFalse(myTree.contains(1001));
		
		assertTrue(myTree.contains(101));
		assertTrue(myTree.contains(100));
		assertTrue(myTree.contains(107));
		assertTrue(myTree.contains(110));
	}
	
	@Test
	public void testAdd() {
		
		myTree = new BST<Integer>();
		assertFalse(myTree.contains(100));
		assertFalse(myTree.contains(107));
		assertFalse(myTree.contains(110));
		
		assertFalse(myTree.contains(99));
		assertFalse(myTree.contains(1000));
		assertFalse(myTree.contains(000));
		assertFalse(myTree.contains(001));
		assertFalse(myTree.contains(1001));
		
		assertFalse(myTree.contains(101));
		assertFalse(myTree.contains(100));
		assertFalse(myTree.contains(107));
		assertFalse(myTree.contains(110));
		
		myTree.add(106);
		myTree.add(107);
		myTree.add(108);
		myTree.add(109);
		myTree.add(110);
		myTree.add(100);
		myTree.add(101);
		myTree.add(102);
		myTree.add(103);
		myTree.add(104);
		myTree.add(105);
		
		assertTrue(myTree.contains(100));
		assertTrue(myTree.contains(107));
		assertTrue(myTree.contains(110));
		
		assertFalse(myTree.contains(99));
		assertFalse(myTree.contains(1000));
		assertFalse(myTree.contains(000));
		assertFalse(myTree.contains(001));
		assertFalse(myTree.contains(1001));
		
		assertTrue(myTree.contains(101));
		assertTrue(myTree.contains(100));
		assertTrue(myTree.contains(107));
		assertTrue(myTree.contains(110));
	}
	
	@Test
	public void testRemove() {
		assertTrue(myTree.contains(100));
		assertTrue(myTree.contains(107));
		assertTrue(myTree.contains(110));
		
		assertFalse(myTree.contains(99));
		assertFalse(myTree.contains(1000));
		assertFalse(myTree.contains(000));
		assertFalse(myTree.contains(001));
		assertFalse(myTree.contains(1001));
		
		myTree.remove(100);
		
		assertFalse(myTree.contains(100));
		assertTrue(myTree.contains(107));
		assertTrue(myTree.contains(110));
		
		assertFalse(myTree.contains(99));
		assertFalse(myTree.contains(1000));
		assertFalse(myTree.contains(000));
		assertFalse(myTree.contains(001));
		assertFalse(myTree.contains(1001));
		
		myTree.remove(107);
		
		assertFalse(myTree.contains(100));
		assertFalse(myTree.contains(107));
		assertTrue(myTree.contains(110));
		
		assertFalse(myTree.contains(99));
		assertFalse(myTree.contains(1000));
		assertFalse(myTree.contains(000));
		assertFalse(myTree.contains(001));
		assertFalse(myTree.contains(1001));
		
		myTree.remove(110);
		
		assertFalse(myTree.contains(100));
		assertFalse(myTree.contains(107));
		assertFalse(myTree.contains(110));
		
		assertFalse(myTree.contains(99));
		assertFalse(myTree.contains(1000));
		assertFalse(myTree.contains(000));
		assertFalse(myTree.contains(001));
		assertFalse(myTree.contains(1001));
		
		myTree.remove(110);
		
		assertFalse(myTree.contains(100));
		assertFalse(myTree.contains(107));
		assertFalse(myTree.contains(110));
		
		assertFalse(myTree.contains(99));
		assertFalse(myTree.contains(1000));
		assertFalse(myTree.contains(000));
		assertFalse(myTree.contains(001));
		assertFalse(myTree.contains(1001));
		
		myTree.add(110);
		
		assertFalse(myTree.contains(100));
		assertFalse(myTree.contains(107));
		assertTrue(myTree.contains(110));
		
		assertFalse(myTree.contains(99));
		assertFalse(myTree.contains(1000));
		assertFalse(myTree.contains(000));
		assertFalse(myTree.contains(001));
		assertFalse(myTree.contains(1001));
		
		myTree.remove(110);
		
		assertFalse(myTree.contains(100));
		assertFalse(myTree.contains(107));
		assertFalse(myTree.contains(110));
		
		assertFalse(myTree.contains(99));
		assertFalse(myTree.contains(1000));
		assertFalse(myTree.contains(000));
		assertFalse(myTree.contains(001));
		assertFalse(myTree.contains(1001));
		
	}
}
