package abstractionCode;

import accessSpecifier.protectedspecifier1;

public class ProtectedSpecifier2 extends AbstractDemo1{
	ProtectedSpecifier2(){
		super();
	}
	public static void main(String[] args) {
		ProtectedSpecifier2 p1 = new ProtectedSpecifier2();
		AbstractDemo1.main(null);
	}

}
