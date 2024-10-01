
public class AdapterSocket extends PowerPlug{

	Cable c;
	public AdapterSocket(Cable c){
		this.c = c;
	}
	
	@Override
	public void insertTwoSocketCable(){
		c.insertThreeSocketCable();
	}
}
