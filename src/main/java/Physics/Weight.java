package Physics;

public class Weight {
	private double value;
	private String measurementUnit;
	private static final String MEASUREMENT_UNIT = "Kilogram";

	public Weight(double value) {
		this.value = value;
		this.measurementUnit = MEASUREMENT_UNIT;
	}

	public Weight(double value, String measurementUnit) {
		this.value = value;
		this.measurementUnit = measurementUnit;
	}

	public String getMeasurementUnit() {
		return measurementUnit;
	}

	public void setMeasurementUnit(String measurementUnit) {
		this.measurementUnit = measurementUnit;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Weight { " + value + " " + measurementUnit + " }";
	}
}
