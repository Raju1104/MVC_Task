package p.com.Entity;

public class StudentEntity {

	

	private int id;
	private String fname;
	private String lname;
	private String age;
	private String email;
	private String mobile;
	private String address;
	private String admission;
	
	
	public StudentEntity(){}


	public StudentEntity(int id, String fname, String lname, String age, String email, String mobile, String address,
			String admission) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.admission = admission;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getAdmission() {
		return admission;
	}


	public void setAdmission(String admission) {
		this.admission = admission;
	}
	
	
	
}
