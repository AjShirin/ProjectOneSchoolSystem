package RandomUserAPI;

import java.io.Serializable;

public class Location implements Serializable{
	private String city;
	private String state;
	private String country;
	private String postcode;
	
	private Timezone timezone;
	private Street street;
	private Coordinates coordinates;

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public static void main(String[] args) {
		

	}

}
