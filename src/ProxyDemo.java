//���ģʽ--�������


interface Network{   		//����Network�ӿ�
	public void browse();   //��������ĳ��󷽷�
}

class Real implements Network{    //��ʵ����������
	@Override
	public void browse() {       
		System.out.println("���������Ϣ");		
	}
	
}

class Proxy implements Network{   //��������
	
	private Network network;
	public  Proxy(Network network) {  //���ô������ʵ����
		this.network = network;
	}
	
	public void check(){
		System.out.println("����û��Ƿ�Ϸ�");
	}
	@Override
	public void browse() {   
		this.check();				//����ͬʱ���ö�������ҵ����صĲ���
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
