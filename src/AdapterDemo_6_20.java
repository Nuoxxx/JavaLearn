//

interface Window{					//����Window���ڣ���ʾ���ڲ���
	public void open();
	public void close();
	public void activated();   
	public void iconified();
	public void deiconified();
}
//���������ʵ�ֽӿڣ��ڴ����и�д�������������еķ�����Ϊ��
abstract class WindowAdapter implements Window{
	public void activated(){};
	public void close(){};
	public void deiconified(){};
	public void iconified(){};
	public void open(){};
}
//����ֱ�Ӽ̳�WindowAdapter�࣬��ѡ���ʵ����Ҫ�ķ���
class WindowImpl extends WindowAdapter{
	@Override
	public void open() {
		System.out.println("���ڴ򿪡�");
	}
	@Override
	public void close() {
		System.out.println("���ڹرա�");
	}
}



public class AdapterDemo_6_20 {

	public static void main(String[] args) {
		Window window = new WindowImpl();			//ʵ�ֽӿڶ���
		window.open();
	}

}
