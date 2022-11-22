package RandomUserAPI;

public class Result {
	private String gender;
	private String email;
	private String phone;
	private String cell;
	private String nat;
	
	Coordinates coordinatesObject;
	Dob dobObject;
	Id IdObject;
	Info infoObject;
	Location locationObject;
	Login loginObject;
	Name nameObject;
	Picture pictureObject;
	Registered regosterObject;
	Result resultObject;
	Street streetObject;
	Timezone timezoneObject;
	Unkown unknownObject;

	
	private String getGender() {
		return gender;
	}

	
	private void setGender(String gender) {
		this.gender = gender;
	}

	
	private String getEmail() {
		return email;
	}

	
	private void setEmail(String email) {
		this.email = email;
	}

	
	private String getPhone() {
		return phone;
	}

	
	private void setPhone(String phone) {
		this.phone = phone;
	}

	
	private String getCell() {
		return cell;
	}

	
	private void setCell(String cell) {
		this.cell = cell;
	}

	
	private String getNat() {
		return nat;
	}

	private void setNat(String nat) {
		this.nat = nat;
	}

	public static void main(String[] args) {
		

	}

}
