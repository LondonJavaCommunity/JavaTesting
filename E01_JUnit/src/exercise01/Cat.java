package exercise01;

public class Cat {

	private int weight;
	private String name;

	public Cat(String name, int weight) {
		this.weight = weight;
		this.name = name;
	}

	public void eat( int mealSize ) {
		weight+= mealSize / 2;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", weight=" + weight + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + weight;
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
		Cat other = (Cat) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

}
