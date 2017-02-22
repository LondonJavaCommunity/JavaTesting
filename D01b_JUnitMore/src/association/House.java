package association;

import java.util.Arrays;

public class House {

	private String name;
	private int numRooms= 4;
	private Door[] doors;	/// 1.
	private int numDoors;	/// 1.

	public House(String name, int numRooms) {
		this.name = name;
		this.numRooms = numRooms;
		doors= new Door[numRooms];	/// 1.
	}

	public void addDoor(Door d) {	/// 1.
		if (numDoors >= numRooms) {
			throw new IllegalStateException("Cant add more doors!");
		}
		doors[numDoors++]= d;
	}

	/* 1. Original .toString() , for comparison:
	public String toString() {
		return "House [name=" + name + ", numRooms=" + numRooms + "]";
	} */

	@Override
	public String toString() {
		return "House [name=" + name + ", numRooms=" + numRooms + ", doors=" + Arrays.toString(doors) + ", numDoors="
				+ numDoors + "]";
	}

}
