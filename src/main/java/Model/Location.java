package Model;

public class Location {
	private String relation;
	private Item relationItem;
	private Dimensions volume;
	private static final String ON = "On";
	private static final Item FLOOR = new Item(
			new Weight(0),
			new Dimensions(4,4,0)
	);

	public String getRelation() {
		return relation;
	}
	public Item getRelationItem() {
		return relationItem;
	}
	public void setRelation(String relation, Item relationItem) {
		this.relation = relation;
		this.relationItem = relationItem;
	}

	public Location() {
		this.relation = ON;
		this.relationItem = FLOOR;
	}

	public Location(String relation, Item relationItem) {
		this.relation = relation;
		this.relationItem = relationItem;
	}

	public Location(Dimensions volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Location{" +
				"relation='" + relation + '\'' +
				", relationItem=" + relationItem +
				", volume=" + volume +
				'}';
	}
}
