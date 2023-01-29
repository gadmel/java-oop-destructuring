package Model;

import Physics.Dimensions;
import Physics.Weight;


public class Item {

	private static int counter = 1;
	private int id;
	private Weight weight;
	private Dimensions dimensions;
	private Location location;
	private String name;


	public Item(Weight weight, Dimensions dimensions) {
		this.id = this.counter;
		this.counter++;
		this.weight = weight;
		this.dimensions = dimensions;
	}
	public Item(Weight weight, Dimensions dimensions, String name) {
		this.id = this.counter;
		this.counter++;
		this.name = name;
		this.weight = weight;
		this.dimensions = dimensions;
	}
	public Item(Weight weight, Dimensions dimensions, Location location) {
		this.id = this.counter;
		this.counter++;
		this.weight = weight;
		this.dimensions = dimensions;
		this.location = location;
	}
	public Item(Weight weight, Dimensions dimensions, Location location, String name) {
		this.id = this.counter;
		this.counter++;
		this.weight = weight;
		this.dimensions = dimensions;
		this.location = location;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Weight getWeight() {
		return weight;
	}
	public Dimensions getDimensions() {
		return dimensions;
	}
	public Location getLocation() {
		return location;
	}

	@Override
	public String toString() {
		return "Item{" +
				" id=" + id +
				", name=" + name +
				", weight=" + weight +
				", dimensions=" + dimensions +
				", location=" + location +
				'}';
	}

	public void move(Location moveToLocation) {
		this.setLocation(moveToLocation);
		System.out.println("Moved " + this.getName() + " to " + moveToLocation.getName());
	}

	public void putOnASurface(String relation, Item relationItem){
		this.setLocation(new Location(relation, relationItem));
		System.out.println("Put " + this.getName() + " " + relation + " the " + relationItem.getName());
	};

	public void putOnASurfaceWithinSameLocation(String relation, Item relationItem){
		this.getLocation().setRelation(relation, relationItem);
		System.out.println("Put " + this.getName() + " " + relation + " the " + relationItem.getName() + " within " + this.getLocation().getName());
	};

	public void setLocation(Location location) {
		this.location = location;
	}

}
