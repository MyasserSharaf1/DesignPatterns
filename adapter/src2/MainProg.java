import java.util.ArrayList;

public class MainProg {

	public static void main(String[] args) {
		ArrayList<Copyable> test = new ArrayList<>();
		test.add(new CopyableClass());
		test.add(new CopyableClass());
		test.add(new CopyableClass());
		test.add(new CopyableClass());
		
		ArrayList<Copyable> output1 = UtilityClass.copy(test);
		
		//test.add(new Document()); //error
		
		//////////////////////////////
		
		
		Document d1 = new Document("test");
		Document d2 = new Document("ok");
		Document d3 = new Document(null);
		Document d4 = new Document(null);
		
		ArrayList<Copyable> inputDoc = new ArrayList<>();
		inputDoc.add(new DocumentAdapter(d1));
		inputDoc.add(new DocumentAdapter(d2));
		inputDoc.add(new DocumentAdapter(d3));
		inputDoc.add(new DocumentAdapter(d4));
		
		ArrayList<Copyable> output2 = UtilityClass.copy(inputDoc);
		
		for(Copyable c : output2){
			System.out.println(c);
		}
		
	}

}
