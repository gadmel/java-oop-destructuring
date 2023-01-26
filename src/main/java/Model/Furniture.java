package Model;

import Physics.Dimensions;
import Physics.Weight;

public class Furniture extends Item {

	public Furniture(String name, Weight weight, Dimensions dimensions) {
		super(weight, dimensions, name);
	}
	public Furniture(String name, Weight weight, Dimensions dimensions, Location location) {
		super(weight, dimensions, location, name);
	}


	@Override
	public String toString() {
		return "Furniture (ext. Item) {" +
				" id=" + this.getId() +
				", name=" + this.getName() +
				", weight=" + this.getWeight() +
				", dimensions=" + this.getDimensions() +
				", location=" + this.getLocation() +
				'}';
		}
	}
