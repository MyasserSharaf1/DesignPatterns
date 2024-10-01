
public class HomeTheaterFacade {

	Light light;
	PopcornMachine popper;
	DVDPlayer dvd;
	String movie;
	
	public HomeTheaterFacade(String movie) {
		light = new Light("Living Room");
		popper = new PopcornMachine();
		this.movie = movie;
		dvd = new DVDPlayer(movie);
	}
	
	public void playMovie(){
		light.dim(5);
		popper.on();
		dvd.on();
		dvd.play(movie);
	}
	
	public void endMovie(){
		light.on();
		popper.off();
		dvd.off();
	}
	
}
