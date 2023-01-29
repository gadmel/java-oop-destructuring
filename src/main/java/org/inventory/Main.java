package org.inventory;

import Model.Item;
import Physics.Dimensions;
import Model.Furniture;
import Model.Location;
import Physics.Weight;

public class Main {

	public static void runStudy() {
		Location study = createStudy();
		Furniture glebsDesk = new Furniture(
				"Gleb's Desk",
				new Weight(20),
				new Dimensions(1.2,0.8,1.8),
				study
		);
		Furniture aljonasDesk = new Furniture(
				"Aljona's Desk",
				new Weight(40),
				new Dimensions(1.4,0.8,1.4),
				new Location()
		);
		System.out.println(glebsDesk.toString());
		System.out.println(aljonasDesk.toString());
		aljonasDesk.move(study);
		System.out.println(aljonasDesk.toString());
		aljonasDesk.putOnASurface("on", glebsDesk);
		System.out.println(aljonasDesk.toString());
		aljonasDesk.move(new Location("Kitchen", new Dimensions(2,2,2.5)));
		aljonasDesk.putOnASurfaceWithinSameLocation("on", new Item( new Weight(10), new Dimensions(1,1,0.6), "Table"));
		System.out.println(aljonasDesk.toString());
	}

	private static Location createStudy() {
		String studyName = "Study";
		Dimensions studyRoom = new Dimensions(4,4,2.5);
		return new Location(studyName, studyRoom);
	}

	public static void main(String[] args) {
		runStudy();
	}


}