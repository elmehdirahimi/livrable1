package employe;
import java.io.Closeable;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<TraiterComande> mesComandes = new ArrayList<TraiterComande>();
		mesComandes.add(new TraiterComande("arahimi", "mehdi"));
		mesComandes.add(new TraiterComande("rahimiii", "amehdiiiii"));
		TraiterCommandePage list = new TraiterCommandePage(mesComandes);		
	}
}
