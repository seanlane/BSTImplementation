import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;


public class TestBST3 
{
	
	private static BST<Integer> tree1;
	private static BST<Integer> tree2;
	private static BST<Integer> tree3;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		tree1 = new BST<Integer>();
		tree1.add(6);
		tree1.add(2);
		tree1.add(1);
		tree1.add(3);
		tree1.add(5);
		tree1.add(4);
		tree1.add(8);
		tree1.add(7);
		tree1.add(10);
		tree1.add(9);

		tree2 = new BST<Integer>();
		tree2.add(10);
		tree2.add(9);
		tree2.add(8);
		tree2.add(7);
		tree2.add(6);
		tree2.add(5);
		tree2.add(4);
		tree2.add(3);
		tree2.add(2);
		tree2.add(1);
		
		tree3 = new BST<Integer>();
		tree3.add(1);
		tree3.add(2);
		tree3.add(3);
		tree3.add(4);
		tree3.add(5);
		tree3.add(6);
		tree3.add(7);
		tree3.add(8);
		tree3.add(9);
		tree3.add(10);
	}
	
	@Test
	public void preInOrder() 
	{
		List<Integer>myList = tree1.getPreOrderTraversal();		
		int[] testList1 = {6,2,1,3,5,4,8,7,10,9};
		for(int i = 0; i < myList.size(); i++)
			assertTrue(myList.get(i) == testList1[i]);
		
		myList = tree2.getPreOrderTraversal();
		int[] testList2 = {10,9,8,7,6,5,4,3,2,1};
		for(int i = 0; i < myList.size(); i++)
			assertTrue(myList.get(i) == testList2[i]);
		
		myList = tree3.getPreOrderTraversal();
		int[] testList3 = {1,2,3,4,5,6,7,8,9,10};
		for(int i = 0; i < myList.size(); i++)
			assertTrue(myList.get(i) == testList3[i]);
	}

	@Test
	public void testInOrder() 
	{
		List<Integer> myList = tree1.getInOrderTraversal();
		for(int i = 0; i < myList.size(); i++)
			assertTrue(myList.get(i) == i + 1);
		
		myList = tree2.getInOrderTraversal();
		for(int i = 0; i < myList.size(); i++)
			assertTrue(myList.get(i) == i + 1);
		
		myList = tree3.getInOrderTraversal();
		for(int i = 0; i < myList.size(); i++)
			assertTrue(myList.get(i) == i + 1);
	}
	
	@Test
	public void postInOrder() 
	{
		List<Integer>myList = tree1.getPostOrderTraversal();		
		int[] testList1 = {1,4,5,3,2,7,9,10,8,6};
		for(int i = 0; i < myList.size(); i++)
			assertTrue(myList.get(i) == testList1[i]);
		
		myList = tree2.getPostOrderTraversal();
		int[] testList2 = {1,2,3,4,5,6,7,8,9,10};
		for(int i = 0; i < myList.size(); i++)
			assertTrue(myList.get(i) == testList2[i]);
		
		myList = tree3.getPostOrderTraversal();
		int[] testList3 = {10,9,8,7,6,5,4,3,2,1};
		for(int i = 0; i < myList.size(); i++)
			assertTrue(myList.get(i) == testList3[i]);
	}

}
