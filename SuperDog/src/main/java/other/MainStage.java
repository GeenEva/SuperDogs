package other;

import daoos.GenericDAO;
import domain.*;
import javax.persistence.*;

public class MainStage {

	public static void main(String[] args) {
		
	DogPapa siwawa = new Chihuahua();
	Class c = siwawa.getClass();
//	System.out.println(c.toString());
//	siwawa.setId(2);
//	siwawa.setAge(66);
//	siwawa.setName("WuFER");
	
		GenericDAO genDAO = new GenericDAO();
	genDAO.deleteObject(siwawa.getClass(), 8);

/*	GenericDAO genDAO = new GenericDAO();
				DogPapa poodle = new Poodle("pipo", 55);
		genDAO.createObject(poodle);
		
		DogPapa chi = new Chihuahua("riri", 33, true);
		genDAO.createObject(chi);
	*/	
		genDAO.closeEntityManager();
		
	}

}
