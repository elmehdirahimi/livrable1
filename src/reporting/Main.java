package reporting;

import java.util.ArrayList;

import chef.ChefPage;
import chef.ConsulterDemande;
import chef.NouvelleDemande;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Procedure> mesProcedure = new ArrayList<Procedure>();
		mesProcedure.add(new Procedure("arahimi", 3,2,4));
		mesProcedure.add(new Procedure("rahimiii",2,2,4));
		
		ArrayList<Etape> mesEtapes = new ArrayList<Etape>();
		mesEtapes.add(new Etape("arahimi", 2,2,4));
		mesEtapes.add(new Etape("rahimiii", 2,2,4));		
		ReportingPage list = new ReportingPage(mesProcedure,mesEtapes);		
	}
}
