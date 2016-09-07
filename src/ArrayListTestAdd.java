import java.util.ArrayList;

public class ArrayListTestAdd {
	static ArrayList<String> myList = new ArrayList<String>();

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myList.add("Karen");
		myList.add("Don");
		myList.add("Mark");
		ArrayList<String> temp = new ArrayList<String> (myList); 
		ArrayList<String> sameList = myList;
		myList.add (1, "Courtney");


		System.out.println(myList);
		System.out.println(temp);
		System.out.println(sameList);
		
		
		
		
		
		
		
		//////////////////////////////////////////////////
	//	ArrayListTest 2 why copy is better than clone?
		ArrayList<String> original = new ArrayList<String>();
		original.add ("yes");
		ArrayList<Integer> copy = (ArrayList<Integer>)original.clone();
		
		System.out.println (copy.get (0));
		
	}

}
