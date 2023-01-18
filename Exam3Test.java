import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class Exam3Test {

	@Test
	void testCreateArray() {
		//Exam3.createArray("Merry-go-round","-");
		String[] expected = {"Merry","go", "round"};
		String[] actual = Exam3.createArray("Merry-go-round","-");
		assertArrayEquals(expected, actual);
		
	}
	@Test
	void testCreateArray2() {
		//Exam3.createArray("Merry-go-round","-");
		String[] expected = {"h","e","l","l","o"};
		String[] actual = Exam3.createArray("hello","");
		assertArrayEquals(expected, actual);
	}
	@Test
	void testCreateArray3() {
		//Exam3.createArray("Merry-go-round","-");
		String[] expected = {"No","I","am","your","father"};
		String[] actual = Exam3.createArray("No I am your father"," ");
		assertArrayEquals(expected, actual);
}
	@Test
	void testCreateArray4() {
		//Exam3.createArray("Merry-go-round","-");
		String[] expected = {"I'm m","king w","ffles"};
		String[] actual = Exam3.createArray("I'm making waffles","a");
		assertArrayEquals(expected, actual);
}
	@Test
	void testaddNumber() {
		
		ArrayList<Integer> missing = new ArrayList<>(Arrays.asList(2,3,7));
		ArrayList<Integer>actual = Exam3.addNum(missing, 4);
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2,3,7,4));
		assertEquals(expected, actual);
		//concurrent modification exception
	}

	
	@Test
	void testaddNumber2() {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,6,8));
		ArrayList<Integer> extra = Exam3.addNum(list, 4); 
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4,6,8));
		assertEquals(expected, extra);
		assertSame(list, extra);
}
	@Test
	void testLowestNumber() {
		LinkedList<Integer>list = new LinkedList<>(Arrays.asList(2,3,7));
		int expected =2;
		int actual =  Exam3.findMin(list); 
		assertEquals(expected, actual);
		
		
	}
	@Test
	void testHashMap() {
		HashMap<String,String>sandwich = new HashMap<>();
		sandwich.put("bread", "butter");
		sandwich.put("peanut butter","jelly");
		String actual =Exam3.modifyMap(sandwich);
		String expected = "test";
		assertEquals(expected, actual);
		
		
	}
}

