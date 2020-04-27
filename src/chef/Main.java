package chef;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ArrayList<NouvelleDemande> mesDemandes = new ArrayList<NouvelleDemande>();
		mesDemandes.add(new NouvelleDemande("arahimi", "mehdi"));
		mesDemandes.add(new NouvelleDemande("rahimiii", "amehdiiiii"));
		
		ArrayList<ConsulterDemande> consulterList = new ArrayList<ConsulterDemande>();
		consulterList.add(new ConsulterDemande("arahimi", "mehdi",true));
		consulterList.add(new ConsulterDemande("rahimiii", "amehdiiiii",true));		
		ChefPage list = new ChefPage(mesDemandes,consulterList);		
	}
}
