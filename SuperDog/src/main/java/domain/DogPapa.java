package domain;

import javax.persistence.*;

@MappedSuperclass
public class DogPapa {

	protected long id;
	protected String name;
	protected int age;
	
	
	public DogPapa(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "DogPapa [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
