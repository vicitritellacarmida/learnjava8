package vicitritellacarmida.interfacejava8;

@FunctionalInterface
public interface Interface1 {
	
	void method1(String str);
	
	default void log(String str) {
		System.out.println("logging I1: "+str);
	}
	
	static void print(String str) {
		System.out.println("printing i1 : "+str);
	}

}
