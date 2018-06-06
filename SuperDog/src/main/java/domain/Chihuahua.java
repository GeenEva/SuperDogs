package domain;

import javax.persistence.*;

@Entity
@Inheritance
@Table
public class Chihuahua extends DogPapa {
	
	private boolean agressive;

//	public Chihuahua() {}
	
	public Chihuahua(String name, int age, boolean agr) {
		super(name, age);
		this.agressive = agr;
	
	}

	public boolean isAgressive() {
		return agressive;
	}

	public void setAgressive(boolean agressive) {
		this.agressive = agressive;
	}
	
	
}
