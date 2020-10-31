import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	static {
		
		sdf=new SimpleDateFormat("dd/MM/yyyy");
	}
	
	static SimpleDateFormat sdf;
	private int id;
	private String name;
	private String mobile;
	private Date dob;
	private String email;
	
	//default constructor
	public Person() {
		id=0;
		name=null;
		mobile=null;
		dob=null;
		email=null;
	}
	            //this
	public Person(int id,String name,String mob,String email,Date bd) {
		this.id=id;
		this.name=name;
		this.mobile=mob;
		this.email=email;
		dob=bd;
	}
	
	//setter and getter methods
	/*
	 * public void setId(int id) { this.id=id; }
	 */
	public void setName(String nm) {
		this.name=nm;
		
	}
	public void setMobile(String m) {
		this.mobile=m;
	}
	public void setEmail(String m) {
		this.email=m;
	}
	public void setDob(Date dt) {
		this.dob=dt;
		
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getMobile() {
		return mobile;
	}
	public String getEmail() {
		return email;
	}
	public Date getDob() {
		return dob;
	}
	
	
	  public String toString() { System.out.println("In tostring method"); return
	  "Id: "+this.id+"\nName: "+this.name+"\nMobile: "+this.mobile+"\nEmail: "+this.email+"\nDOB "+sdf.format(dob); }
	 
	/*public void display() {
		System.out.println("Id : "+this.id );
		System.out.println("name: "+this.name);
		System.out.println("Mobile : "+mobile);
		System.out.println("Birth Date: "+dob);
		
	}*/
	
	
	
	
	
}
