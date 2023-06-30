package jndiTest;

import java.io.Serializable;

public class Student implements Serializable {

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Id = " + getId() + "Name = " + getName();
	}

}
