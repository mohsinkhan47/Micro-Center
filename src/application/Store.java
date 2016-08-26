package application;

public class Store {

	String city, state;
	int locationCode;

	public Store() {
	}

	public Store(int locationCode, String city, String state) {
		this.locationCode = locationCode;
		this.city = city;
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(int locationCode) {
		this.locationCode = locationCode;
	}

	@Override
	public String toString() {
		String temp = this.getLocationCode() + " is located in " + this.getCity() + ", " + this.getState() + ".";
		return temp;
	}

}