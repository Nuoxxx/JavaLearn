//内部类的扩展
//一个抽象类中包含接口
abstract class A{
	public abstract void printA();
	
	interface B{
		public void printB();
	}
}

class X extends A{

	@Override
	public void printA() {
		System.out.println("HELLO-->A");
	}
	class Y implements B{

		@Override
		public void printB() {
			System.out.println("HELLO-->B");
		}
		
	}
}

public class InnerExtDemo_6_9_7 {
	public static void main(String args[]) {
		A.B b = new X().new Y();
		b.printB();
	}
}
