package abstractStudy;

public class Concrete_Use extends Abstract_Demo{

	public static void main(String[] args) {

		Concrete_Use C=new Concrete_Use();
		C.method3();
		C.method4();
		C.method2();
        C.method1();
        C.method5();

	}

	@Override
	public void method3() {
	
		System.out.println("This is method3 completed by concrete class");
	}

	@Override
	public void method4() {
		System.out.println("This is method4 completed by concrete class");
		
	}

	@Override
	public void method5() {
		System.out.println("This is method4 updated for git practice");
		
	}
	
	//this is modified
}

