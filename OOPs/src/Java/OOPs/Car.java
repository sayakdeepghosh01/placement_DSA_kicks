package Java.OOPs;
abstract class vehicle{
	
	public abstract void drive();
	
	void playingMusic() {
		System.out.println("Playing...");
	}
	
	
}
class wagonR extends vehicle{
	
	public void drive() {
		System.out.println("Driving...");
	}
	public void dance() {
		System.out.println("Dancing....");

	}
}


public class Car {

	public static void main(String[] args) {
		wagonR obj=new wagonR();
		obj.drive();
		obj.playingMusic();
		obj.dance();

	}

}
