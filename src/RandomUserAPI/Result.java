package RandomUserAPI;

import java.io.Serializable;

public class Result implements Serializable{
	private String gender;
	private String email;
	private String phone;
	private String cell;
	private String nat;
	
	
	private Dob dob;
	private Id IdO;
	private Info info;
	private Location location;
	private Login login;
	private Name name;
	private Picture picture;
	private Registered regoster;
	
	
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCell() {
		return cell;
	}
	public void setCell(String cell) {
		this.cell = cell;
	}
	public String getNat() {
		return nat;
	}
	public void setNat(String nat) {
		this.nat = nat;
	}
	
	public Dob getDob() {
		return dob;
	}
	public void setDob(Dob dob) {
		this.dob = dob;
	}
	public Id getIdO() {
		return IdO;
	}
	public void setIdO(Id idO) {
		IdO = idO;
	}
	public Info getInfo() {
		return info;
	}
	public void setInfo(Info info) {
		this.info = info;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public Picture getPicture() {
		return picture;
	}
	public void setPicture(Picture picture) {
		this.picture = picture;
	}
	public Registered getRegoster() {
		return regoster;
	}
	public void setRegoster(Registered regoster) {
		this.regoster = regoster;
	}
	

}
	