package com.sonarCloud.model;

public class Persona {
	private String name;
	private Integer years;
	public Persona() {
		super();
	}
	public Persona(String name, Integer years) {
		super();
		this.name = name;
		this.years = years;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getYears() {
		return years;
	}
	public void setYears(Integer years) {
		this.years = years;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((years == null) ? 0 : years.hashCode());
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
		Persona other = (Persona) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (years == null) {
			if (other.years != null)
				return false;
		} else if (!years.equals(other.years))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Persona [name=" + name + ", years=" + years + "]";
	}
	
	
	

}
