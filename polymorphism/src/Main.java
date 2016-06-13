package polymorphism;

public class Main {

	public static void main(String[] args) {
		Guitar yamaha = new Guitar(6,"melodious");
		yamaha.setNotes(8);
		yamaha.setPrice(1000);
		yamaha.setType("electric");
		yamaha.play("Tum hi ho");
		((Guitar)yamaha).nowplaying();
		
		
	}

}
