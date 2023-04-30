package constructorsCodes;

public class ConstructOverloading {
	ConstructOverloading(){
		System.out.println(100);
	}
	ConstructOverloading(int x){
		System.out.println(x);
	}
	ConstructOverloading(char y){
		System.out.println(y);
	}
	ConstructOverloading(String z){
		System.out.println(z);
	}
	ConstructOverloading(float z){
		System.out.println(z);
	}
	ConstructOverloading(int x, double y, char z,long a){
		System.out.print(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
	}
public static void main(String[] args) {
	ConstructOverloading a1 = new ConstructOverloading();
	ConstructOverloading a2 = new ConstructOverloading(100);
	ConstructOverloading a3 = new ConstructOverloading('b');
	ConstructOverloading a4 = new ConstructOverloading("Hello Arka");
	ConstructOverloading a5 = new ConstructOverloading(1.7f);
	ConstructOverloading a6 = new ConstructOverloading(200,10.7,'c',123l);
}
}
