package other;

import daoos.GenericDAO;
import domain.*;
import javax.persistence.*;

public class MainStage {

	public static void main(String[] args) {
		
		Chihuahua chi = new Chihuahua("chichi", 21, true);
		Chihuahua chi2 = new Chihuahua("chochi", 23, true);
	
		
		System.out.println(chi.equals(chi2));
		
/*		GenericDAO genDAO = new GenericDAO();
		
		DogPapa poodle = new Poodle("WuFER", 66);
		genDAO.createObject(poodle);
		
		DogPapa chi = new Chihuahua("Pluto", 3, true);
		genDAO.createObject(chi);
		
		genDAO.closeEntityManager();
*/		
	}

}
