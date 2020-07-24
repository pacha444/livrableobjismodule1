package exec;


import com.gestionclient.domaine.Groupement;

import com.gestionclient.domaine.Persphysique;

public class TestApp {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
		
    Groupement grp =new Groupement(1,"+221781277881", "pamoussacisse@gmail.com", "Kundal Group", "238761", "12JZER", "papa moussa cisse", "1870198702386") ;
    	
    Persphysique pers = new Persphysique(2, "772953450", "diopsy@gmail.com", "4567", "Diop", "Sy", "1870198702386", 2,"celibataire");
    
    grp.identifiercli();
    System.out.println("Le client de type personne physique créé est:"+" "+pers.toString());
}
}