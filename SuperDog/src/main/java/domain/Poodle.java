package domain;

import javax.persistence.*;

@Entity
@Table(name = "poodle")
public class Poodle extends DogPapa {

	public Poodle(String name, int age) {
		super(name, age);
	}

}
