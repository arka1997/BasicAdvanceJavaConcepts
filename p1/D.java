package p1;

public class D {
  public static void main(String[] args) {
//	0 + 3 = 3
//	3 + 4 = 7
//	7 + 5 = 12
//	12 + 6 = 18
//	...
	  int sum = 0;
	int count = 3;
	   
	  
	for (int i=1;i<=10;i++)
	{
//		sum += count;
		sum = sum + count;
		if(i%2==0) {
//		System.out.println("-"+sum);
		}
		else {
//			System.out.println(sum);
		}
		count++;
	}
	
}
}
