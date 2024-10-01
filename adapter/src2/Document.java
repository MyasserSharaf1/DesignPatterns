
public class Document {

	String name;
	
	
	public Document(String name) {
		this.name = name;
	}


	public boolean isValid(){
		if(name == null)
			return false;
		return true;
	}
}
