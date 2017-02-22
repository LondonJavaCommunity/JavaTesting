package exercise03;

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

}
