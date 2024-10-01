
public class Light {

	String location;
	public Light(String location){
		this.location=location;
	}
	
	public void on(){
		System.out.println("Lights on in "+location);
	}
	

	public void off(){
		System.out.println("Lights off in "+location);
	}

	public void dim(int level){
		System.out.println("Lights dimmed to "+level+" in "+location);
	}
}
