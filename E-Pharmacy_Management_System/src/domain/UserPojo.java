package domain;

public class UserPojo {
	private String id;
	private String name;
	private String dob;
	private String address;
	private String phone;
	private String salary;
	private String pwd;
	public UserPojo() {}
	public UserPojo(String id, String name, String dob, String address, String phone, String salary, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.phone = phone;
		this.salary = salary;
		this.pwd = pwd;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	

}
