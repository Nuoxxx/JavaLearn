//�ڲ������չ
//һ���������а����ӿ�
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
