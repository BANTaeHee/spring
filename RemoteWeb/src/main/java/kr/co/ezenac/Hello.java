package kr.co.ezenac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//1. ���� ȣ�������� ���α׷����� ���
@Controller
public class Hello {
	int iv = 10;			//�ν��Ͻ� ����
	static int cv = 20;		//static ����
	
	//2. URL�� �޼��带 ���� 
	@RequestMapping("/hello")
	private void main1() {			//�ν��Ͻ� �޼��� - �Ƚ��Ͻ� ����, static ���� �� �� ��밡��
		System.out.println("Hello - private");
		System.out.println(iv);
		System.out.println(cv);
	}
}
