package domain;

import javax.persistence.*;

@Entity
@Inheritance
public class Poodle extends DogPapa {

	public Poodle(String name, int age) {
		super(name, age);
	}

}
