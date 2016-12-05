//

interface Window{					//定义Window窗口，表示窗口操作
	public void open();
	public void close();
	public void activated();   
	public void iconified();
	public void deiconified();
}
//定义抽象类实现接口，在此类中覆写方法，但是所有的方法体为空
abstract class WindowAdapter implements Window{
	public void activated(){};
	public void close(){};
	public void deiconified(){};
	public void iconified(){};
	public void open(){};
}
//子类直接继承WindowAdapter类，有选择地实现需要的方法
class WindowImpl extends WindowAdapter{
	@Override
	public void open() {
		System.out.println("窗口打开。");
	}
	@Override
	public void close() {
		System.out.println("窗口关闭。");
	}
}



public class AdapterDemo_6_20 {

	public static void main(String[] args) {
		Window window = new WindowImpl();			//实现接口对象
		window.open();
	}

}
