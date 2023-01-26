package Physics;

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

	public String getVolume() {
		String len = String.valueOf(length);
		String wid = String.valueOf(width);
		String hei = String.valueOf(height);
		char u = measurementUnit.charAt(0);
		String x = " x ";
		return (len + x + wid + x + hei ) + " " + u + "³";
	}

	@Override
	public String toString() {
		return "Dimensions { " +
				"length=" + length + " " + measurementUnit +
				", width=" + width + " " + measurementUnit +
				", height=" + height + " " + measurementUnit +
				" }";
	}
}
