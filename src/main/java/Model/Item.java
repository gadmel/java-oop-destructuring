package Model;

import Physics.Dimensions;
import Physics.Weight;

public class Item {
	private int id;
	private Weight weight;
	private Dimensions dimensions;
	private Location location;


	public Item(Weight weight, Dimensions dimensions) {
		this.id = id;
		this.weight = weight;
		this.dimensions = dimensions;
	}
	public Item(Weight weight, Dimensions dimensions, Location location) {
		this.weight = weight;
		this.dimensions = dimensions;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public Weight getWeight() {
		return weight;
	}
	public void setWeight(Weight weight) {
		this.weight = weight;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}
	public void setDimensions(Dimensions dimensions) {
		this.dimensions = dimensions;
	}

	@Override
	public String toString() {
		return "Item{" +
				"id=" + id +
				", weight=" + weight +
				", dimensions=" + dimensions +
				", location=" + location +
				'}';
	}

	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}

}
