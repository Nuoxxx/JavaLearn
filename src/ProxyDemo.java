//设计模式--代理设计


interface Network{   		//定义Network接口
	public void browse();   //定义浏览的抽象方法
}

class Real implements Network{    //真实的上网操作
	@Override
	public void browse() {       
		System.out.println("上网浏览信息");		
	}
	
}

class Proxy implements Network{   //代理上网
	
	private Network network;
	public  Proxy(Network network) {  //设置代理的真实操作
		this.network = network;
	}
	
	public void check(){
		System.out.println("检查用户是否合法");
	}
	@Override
	public void browse() {   
		this.check();				//可以同时调用多个与具体业务相关的操作
		this.network.browse();
	}
	
}

public class ProxyDemo {

	public static void main(String[] args) {
		Network net = null;
		net = new Proxy(new Real());
		net.browse();
	}

}
