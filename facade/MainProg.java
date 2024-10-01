
public class MainProg {

	public static void main(String[] args) {
		HomeTheaterFacade facade = new HomeTheaterFacade("test");
		facade.playMovie();
		facade.endMovie();
	}

}
