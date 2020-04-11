package fundamental.delegation;

public class C implements I{
	I iA = new A();
	I iB = new B();
	
	public void f() {
		iA.f();
	}
	
	public void g() {
		iB.g();
	}
	
	public void r() {
		System.out.println("Method r do some...");
	}
}
