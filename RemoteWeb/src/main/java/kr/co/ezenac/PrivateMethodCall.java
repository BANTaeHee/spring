package kr.co.ezenac;

public class PrivateMethodCall {

	public static void main(String[] args) {
		Hello hello = new Hello();
		//hello.main();			//private�̶� �ܺ� ȣ�� �Ұ�
		
		/*
		 * http://localhost:8080/ezenac/hello ����� main() ȣ���
		 * 	- reflection api�� ����߱� ������ ������
		 *  	- Ŭ���� ������ ��� �ٷ� �� �ִ� ������ ��� ����
		 *  	- java.lang.reflect ��Ű���� ����
		 *  
		 */
		
		try {
			/*
			 *  Hello Ŭ������ Class��ü(Ŭ������ ������ ����ִ� ��ü)�� ����
			 *  	- Ŭ���� ���� (*.class)�� �޸𸮿� �ö� ��, Ŭ�������� Class ��ü�� �ϳ��� ������
			 */
			Class helloClass = Class.forName("kr.co.ezenac.Hello");
			Hello hello2 = (Hello) helloClass.newInstance();
			
			helloClass.getDeclaredMethod("main1");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {e.printStackTrace();}
		
		
		
	}

}
