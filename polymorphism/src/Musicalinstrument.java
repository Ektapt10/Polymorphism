package polymorphism;

public class Musicalinstrument {
                 int notes;
                 int Price;
                 String type;
                 
                 public Musicalinstrument() {
					super();
				}
				public void play(String song){
                	 System.out.println("Now Playing "+ song);
                 }
	             public void poweroff(){
	            	 System.out.println("Instrument turned off");
	             }
				public int getNotes() {
					return notes;
				}
				public void setNotes(int notes) {
					this.notes = notes;
				}
				public int getPrice() {
					return Price;
				}
				public void setPrice(int price) {
					Price = price;
				}
				public String getType() {
					return type;
				}
				public void setType(String type) {
					this.type = type;
				}
	             
	             
}
