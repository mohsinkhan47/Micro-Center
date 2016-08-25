package application;

public class Technician {
	String firstName, LastName, assignID;
	int closes, sameDays, timer, customerServiceCheckIns;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getAssignID() {
		return assignID;
	}

	public void setAssignID(String assignID) {
		this.assignID = assignID;
	}

	public int getCloses() {
		return closes;
	}

	public void setCloses(int closes) {
		this.closes = closes;
	}

	public int getSameDays() {
		return sameDays;
	}

	public void setSameDays(int sameDays) {
		this.sameDays = sameDays;
	}

	public int getTimer() {
		return timer;
	}

	public void setTimer(int timer) {
		this.timer = timer;
	}

	public int getCustomerServiceCheckIns() {
		return customerServiceCheckIns;
	}

	public void setCustomerServiceCheckIns(int customerServiceCheckIns) {
		this.customerServiceCheckIns = customerServiceCheckIns;
	}

	public String toString() {
		String temp = "The Technician name is +" + this.getFirstName() + " " + this.getLastName() + ".\n";
		temp += "Assign ID is " + this.assignID + ".\n";
		temp += this.assignID + " has completed " + this.closes + "closes and has done " + sameDays + " same days.";
		temp += this.assignID + " has helped with " + this.getCustomerServiceCheckIns() + " customer check in.";

		return temp;
	}

}