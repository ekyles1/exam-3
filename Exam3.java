import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Exam3 {

	public static String[] createArray(String word, String delimeter){
		String split[] = word.split(delimeter);
		return split;
	//if its a list put the <>, put the data type in the arrows.
		//methods generally need the ()
}
	public static ArrayList<Integer> addNum (ArrayList<Integer>numbers, int nombres){
		for (int num: numbers) {
			//type then name . after colon put arraylist name. 
			if (num ==nombres) {
				return numbers;
			
					
			}
				
		}
		numbers.add(nombres);
		return numbers;
		
	}
	
	public static int findMin(LinkedList<Integer> lowest) {
		int smallest = lowest.getFirst();
				for(int list: lowest) {
					if (list<smallest) {
						smallest = list;
					}
			
			
		}
		return smallest;
		
			}
	
	
	
	public static String modifyMap(HashMap<String, String> group) {
		group.put("java", "test");

		return group.get("java");
		
	}
}
	
	
	
	