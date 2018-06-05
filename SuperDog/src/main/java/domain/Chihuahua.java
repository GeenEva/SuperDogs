package domain;

import javax.persistence.*;

@Entity
@Table(name = "chihuahua")
public class Chihuahua extends DogPapa {

	
	public Chihuahua(String name, int age) {
		super(name, age);
	
	}
}
