
public class DVDPlayer {

	String movie;
	public DVDPlayer(String movie) {
		this.movie = movie;
	}
	
	public void on(){
		System.out.println("DVD on");
	}
	

	public void off(){
		System.out.println("DVD off");
	}
	
	public void play(String movie){
		System.out.println(movie+" playing");
	}
}
