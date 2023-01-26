package Model;

public class Dimensions {
	private double length;
	private double width;
	private double height;
	private String measurementUnit;
	private static final String MEASUREMENT_UNIT = "Meter";

	public Dimensions(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
		this.measurementUnit = MEASUREMENT_UNIT;
	}

	public Dimensions(double length, double width, double height, String measurementUnit) {
		this.length = length;
		this.width = width;
		this.height = height;
		this.measurementUnit = measurementUnit;
	}
}
