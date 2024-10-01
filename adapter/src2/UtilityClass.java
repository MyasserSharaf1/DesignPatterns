import java.util.ArrayList;

public class UtilityClass {

	public static ArrayList<Copyable> copy(ArrayList<Copyable> input){
		ArrayList<Copyable> output = new ArrayList<>();
		
		for(Copyable c : input){
			if(c.isCopyable())
				output.add(c);
		}
		return output;
	}
}
