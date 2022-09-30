package tasks;

public class County {
	private String name;
	private String location;
	private String State;
	private Integer zipcode;
	private Integer apn;
	
	
	
	
	@Override
	public String toString() {
		return "[name=" + name + ", location=" + location + ", State=" + State + ", zipcode=" + zipcode
				+ ", apn=" + apn + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public Integer getZipcode() {
		return zipcode;
	}
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}
	public Integer getApn() {
		return apn;
	}
	public void setApn(Integer apn) {
		this.apn = apn;
	}
	
	

}
