interface A{
	int a=10;
	void ma();
}
interface A1 extends A{
	int a1=10;
	void ma1();
}
interface A2 extends A1{
	int a2=10;
	void ma2();
}
interface A12 extends A1,A2{
	int a3=10;
	void ma3();
}
class B implements A12{
	public void ma(){
		System.out.println(a);
	}
	public void ma1(){
		System.out.println(a1);
	}
	public void ma2(){
		System.out.println(a2);
	}
	public void ma3(){
		System.out.println(a3);
	}
}
public class lab_7a1{
	public static void main(String []args){
		B b = new B();
		b.ma();
		b.ma1();
		b.ma2();
		b.ma3();
		

	}
}