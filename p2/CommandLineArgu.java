package p2;

//sub class for class A in package1
//But non sub class for class B in Package2
//class A and class C forms parent child relationship forming single inheritance 
//class C and class B are non-sub class for each other, so we create object of p1.B 
//in class C and call class B.
public class CommandLineArgu extends methodDemo{
	public static void main(String[]args) {//pass the arguments in string[] args from "Run As -> Run Configurations -> Program Arguments"
	CommandLineArgu c1 = new CommandLineArgu();
	//calling the main method by creating object of methodDemo class
	methodDemo m1 = new methodDemo();
	methodDemo.main(null);//calling the main method of another class and passing null as an argumnet to the string array present in main method
	System.out.println(args.length);
	System.out.println(args[0]);
	System.out.println(args[1]);
	}
}
