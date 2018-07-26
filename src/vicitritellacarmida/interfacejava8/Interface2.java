package vicitritellacarmida.interfacejava8;

@FunctionalInterface
public interface Interface2 {

	void method2();
	
	default void log(String str) {
		System.out.println("logg i2: "+str);
	}
}
