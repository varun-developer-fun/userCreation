package com.spring.main.app;

import java.util.Objects;

public class Student {

	private Integer id;
	private String name;
	private String place;

	public Student(Integer id, String name, String place) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPlace() {
		return place;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", place=" + place + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getEnclosingInstance().hashCode();
		result = prime * result + Objects.hash(id, name, place);
		return result;
	}

	private Object getEnclosingInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ((obj == null) || (getClass() != obj.getClass())) {
			return false;
		}
		Student other = (Student) obj;
		if (!getEnclosingInstance().equals(other.getEnclosingInstance())) {
			return false;
		}
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(place, other.place);
	}

}
