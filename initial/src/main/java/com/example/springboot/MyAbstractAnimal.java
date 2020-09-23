package com.example.springboot;

public abstract class MyAbstractAnimal {
	
	private int id;
	private String type;
	
	
	public MyAbstractAnimal(int id, String type) {
		this.id = id;
		this.setType(type);
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) { 
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	//@Override
	public boolean equals2(Object o) {
		if ( o == null )
			return false;
		if ( this == o )
			return true;
		if ( this.type == null )
			return false;
		if ( this.id == ((MyAbstractAnimal) o).getId() && this.type.equals(type)) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + (type == null ? 0: type.hashCode());
		return result;
	}
	
	public int hashCode2() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		MyAbstractAnimal other = (MyAbstractAnimal) obj;
		if (id != other.id)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	
}