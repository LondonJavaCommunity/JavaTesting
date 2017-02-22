package association;

public class Door {

	private String name;
	private int thickness= 45;
	private boolean glazed= false;

	// Lock[] locks;
	// ....


	public Door(String name, int thickness, boolean glazed) {
		this.name = name;
		this.thickness = thickness;
		this.glazed = glazed;
	}

	public String toString() {
		return "Door [name=" + name + ", thickness=" + thickness + ", glazed=" + glazed + "]";
	}


}
