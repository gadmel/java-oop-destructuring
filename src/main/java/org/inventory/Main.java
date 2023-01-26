package org.inventory;

import Physics.Dimensions;
import Model.Furniture;
import Model.Location;
import Physics.Weight;

import net.moznion.random.string.RandomStringGenerator;

public class Main {
	public static void runStudy() {

		Location study = createStudy();
		Furniture glebsPrimaryDesk = new Furniture(
				new Weight(20),
				new Dimensions(1.2,0.8,1.8),
				study
		);
		System.out.println(glebsPrimaryDesk.toString());
		glebsPrimaryDesk.setLocation(study);
		System.out.println(glebsPrimaryDesk.toString());
	}

	private static Location createStudy() {
		Dimensions studyRoom = new Dimensions(4,4,2.5);
		return new Location(studyRoom);
	}

	public static void main(String[] args) {
		RandomStringGenerator generator = new RandomStringGenerator();
		String randomString = generator.generateFromPattern("Ccns");
		System.out.println(randomString);

		runStudy();
	}


}