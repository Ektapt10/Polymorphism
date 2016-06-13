package polymorphism;

public class Guitar extends Musicalinstrument {
	int noofstring;
	String tunes;
	
	public void nowplaying(){
		System.out.println("now plaing" +tunes + "noofstring" + noofstring);
	 
	}

	@Override
	public void play(String song) {
		
		super.play(song);
		System.out.println("Playing with guitar");
	}

	@Override
	public void poweroff() {
		
		super.poweroff();
		System.out.println("Guitar turn off");
	}

	public int getNoofstring() {
		return noofstring;
	}

	public Guitar(int noofstring, String tunes) {
		super();
		this.noofstring = noofstring;
		this.tunes = tunes;
	}

	public void setNoofstring(int noofstring) {
		this.noofstring = noofstring;
	}

	public String getTunes() {
		return tunes;
	}

	public void setTunes(String tunes) {
		this.tunes = tunes;
	}

}
