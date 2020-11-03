import java.util.Date;

public class TestPerson {

	public static void main(String[] args) {
		Person p=new Person(12,"Kishori","11111",new Date());
		//p.display();
		System.out.println(p);
		Person p1=new Person(13,"Rajan","1222",new Date());
		//p1.display();
		System.out.println(p1);
		Person p2=new Person();
		//p2.setId(123);
		p2.setName("Revati");
		p2.setMobile("2222");
		p2.setDob(new Date());
		
	}

}
