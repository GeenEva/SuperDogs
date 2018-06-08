package domain;

import javax.persistence.*;

@Entity
@Inheritance
@Table
public class Chihuahua extends DogPapa {
	
	private boolean agressive;

	public Chihuahua() {}
	
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (agressive ? 1231 : 1237);
		result = prime * result + age;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chihuahua other = (Chihuahua) obj;
		if (agressive != other.agressive)
			return false;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
