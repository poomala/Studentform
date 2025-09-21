package net.javaguides.registration.model;

public class ticket {
	private String passname;
	private String startloc;
	private String destintion;
	private String seat;
	
	public String getPassname() {
		return passname;
	}
	public String getStartloc() {
		return startloc;
	}
	public String getDestintion() {
		return destintion;
	}
	public String getSeat() {
		return seat;
	}
	public void setPassname(String passname) {
		this.passname = passname;
	}
	public void setStartloc(String startloc) {
		this.startloc = startloc;
	}
	public void setDestintion(String destintion) {
		this.destintion = destintion;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	
}
