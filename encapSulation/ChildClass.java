package encapSulation;

public class ChildClass extends parentClas {
	public static void main(String[] args) {
		 ChildClass c=new ChildClass();
		 c.setAge(24);
		 c.setName("sarfraj");
		 int age = c.getAge();
		 System.out.println(age);
		 String name = c.getName();
		 System.out.println(name);
		 
	}

}
