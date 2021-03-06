


package com.confiz.before;

public class UserBeforeBuilder {
	private String firstName; // required
	private String lastName; // required
	private int age; // optional
	private String phone; // optional
	private String address;  //optional

	public UserBeforeBuilder(String firstName, String lastName) {
		this(firstName, lastName, 0);
	}

	public UserBeforeBuilder(String firstName, String lastName, int age) {
		this(firstName, lastName, age, "");
	}

	public UserBeforeBuilder(String firstName, String lastName, int age, String phone) {
		this(firstName, lastName, age, phone, "");
	}

	public UserBeforeBuilder(String firstName, String lastName, int age, String phone, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
