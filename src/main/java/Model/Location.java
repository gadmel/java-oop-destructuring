package Model;

import Physics.Dimensions;
import Physics.Weight;

public class Location {
	private String name;
	private String relation;
	private Item relationItem;
	private Dimensions volume;
	private static final String ON = "on";
	private static final Item FLOOR = new Item(
			new Weight(0),
			new Dimensions(4,4,0),
			"Floor"
	);
	public void setRelation(String relation, Item relationItem) {
		this.relation = relation;
		this.relationItem = relationItem;
	}
	public String showRelation() {
		return relation + " the " + relationItem.getName();
	}

	// This constructor is used for the location related to something: e.g. "On the floor", "On the table", "In the cabinet"
	// which is the default type of the location without parameters. The default location is "On the floor"
	public Location(String relation, Item relationItem) {
		this.relation = relation;
		this.relationItem = relationItem;
	}
	public Location() {
		this.relation = ON;
		this.relationItem = FLOOR;
	}
	// This constructor is used for the location itself as a limited space. Normally it is an indoor place, e.g. a room, a closet, a warehouse etc. It is expected to have a name.
	public Location(String name, Dimensions volume) {
		this.name = name;
		this.volume = volume;
	}

	@Override
	public String toString() {
		boolean thereIsRelation = relation != null && relationItem != null;
		boolean thereIsName = name != null;
		boolean thereIsVolume = this.volume != null && volume.getVolume() != null;

		if (thereIsRelation && !thereIsName) {
			return "Location { " +
					showRelation() +
					" }";
		} else if (!thereIsRelation && thereIsName) {
			if (thereIsVolume) {
				return "Location { " +
						name + " (" +
						volume.getVolume() +
						") }";
			} else return "Location { " +
					name +
					" }";
		} else if (thereIsRelation && thereIsName && !thereIsVolume) {
			return "Location { " + showRelation() + " in the " + name + " }";
		} else if (thereIsRelation && thereIsName && thereIsVolume) {
			return "Location { " + showRelation() + " in the " + name + " ( " + volume.getVolume() + ") }";
		} else return "Error: Location is not defined.";
	}


	public String getName() {
		return this.name;
	}

}
