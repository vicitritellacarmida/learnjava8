package vicitritellacarmida.interfacejava8;

public class MyClass implements Interface1, Interface2{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1(String str) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		Interface1.print(str);
		Interface1 i1 = (s) -> System.out.println(s);
		i1.method1(str);
	}

	public static void main (String[] args) {
		MyClass cla = new MyClass();
		cla.log("vucu");
	}

}
