//one-way adapter

public class DocumentAdapter implements Copyable{

	Document d;

	public DocumentAdapter(Document d) {
		this.d = d;
	}


	@Override
	public boolean isCopyable() {
		return d.isValid();
	}
	
	
}
