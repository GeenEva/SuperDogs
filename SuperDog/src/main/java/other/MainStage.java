package other;

import daoos.GenericDAO;
import domain.Chihuahua;
import domain.DogPapa;
import domain.Poodle;
import javax.persistence.*;

public class MainStage {

	public static void main(String[] args) {
		
		GenericDAO genDAO = new GenericDAO();
		
		DogPapa poodle = new Poodle("WuFER", 66);
		genDAO.createObject(poodle);
		
		DogPapa chi = new Chihuahua("Pluto", 3, true);
		genDAO.createObject(chi);
		
		genDAO.closeEntityManager();
		
	}

}
