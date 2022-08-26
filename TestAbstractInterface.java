package proj1;

interface A{
	void a();
	void b();
	void c();
	void d();
}
abstract class B implements A{
	public void c() {
		System.out.println("i am c");
	}
}
class M extends B{
	public void a() {
		System.out.println("i am A");
	}
	public void b() {
		System.out.println("i am B");
	}
	public void d() {
		System.out.println("i am D");
	}
}
public class TestAbstractInterface{
	 public static void main(String args[]) {
		 A aobj=new M();
		 aobj.a();
		 aobj.b();
		 aobj.c();
		 aobj.d();
		 
		 
	 }
}