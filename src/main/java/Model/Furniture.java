package Model;

import Physics.Dimensions;
import Physics.Weight;

public class Furniture extends Item {

	public Furniture(Weight weight, Dimensions dimensions) {
		super(weight, dimensions);
	}
	public Furniture(Weight weight, Dimensions dimensions, Location location) {
		super(weight, dimensions, location);
	}

	@Override
	public String toString() {
		return "Furniture{} " + super.toString();
	}
}
