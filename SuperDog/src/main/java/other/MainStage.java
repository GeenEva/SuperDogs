package other;

import daoos.GenericDAO;
import domain.Chihuahua;
import domain.DogPapa;
import domain.Poodle;

public class MainStage {

	public static void main(String[] args) {
		
		GenericDAO genDAO = new GenericDAO();
		
		Poodle poodle =	new Poodle("Neushoorn", 24);
		genDAO.createObject(poodle);
		
		DogPapa chi = new Chihuahua("Ger", 12);
		genDAO.createObject(chi);
		
		genDAO.closeEntityManager();
		
	}

}
