
public class CopyableClass implements Copyable{

	@Override
	public boolean isCopyable() {
		double rand = Math.random();
		if(rand == 0)
			return true;
		return false;
	}

}
