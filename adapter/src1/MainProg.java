
public class MainProg {

	public static void main(String[] args) {

		Cable c = new Cable();
		AdapterSocket a = new AdapterSocket(c);
		a.insertTwoSocketCable();
	}
}
