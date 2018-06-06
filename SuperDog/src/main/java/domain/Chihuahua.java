package domain;

import javax.persistence.*;

@Entity
@Inheritance
public class Chihuahua extends DogPapa {


	public Chihuahua(String name, int age) {
		super(name, age);
	
	}
}
