package com.tnsif.dependencyinjection;

public class Person {
	private Job j;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Job getJ() {
		return j;
	}

	public void setJ(Job j) {
		System.out.println("Setter Injection");
		this.j = j;
	}

	public Person(Job j) {
		System.out.println("Contructor Injection");
		this.j = j;
	}

	@Override
	public String toString() {
		return "Person [j=" + j + "]";
	}
	
	

}
