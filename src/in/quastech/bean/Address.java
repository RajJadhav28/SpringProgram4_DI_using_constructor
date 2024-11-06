package in.quastech.bean;

public class Address {
	private String loc;
	private int pin;
	public Address(String loc, int pin) {
		super();
		this.loc = loc;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [loc=" + loc + ", pin=" + pin + "]";
	}
	
	

}
