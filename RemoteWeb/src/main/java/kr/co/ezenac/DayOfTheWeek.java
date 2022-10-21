package kr.co.ezenac;

import java.util.Calendar;

//������� �Է��ϸ� �ش� ������ �˷��ִ� ���α׷�
public class DayOfTheWeek {

	public static void main(String[] args) {
		// 1. �Է�
		 String year = args[0];
		 String month = args[1];
		 String day = args[2];
		 
		// 2. ���ڸ� ���ڷ� �ٲ�
		int yyyy = Integer.parseInt(year);
		int mm = Integer.parseInt(month);
		int dd = Integer.parseInt(day);
		
		Calendar cal = Calendar.getInstance();
		cal.set(yyyy, mm-1, dd);								//��¥ setting
		
		int dayofWeek = cal.get(Calendar.DAY_OF_WEEK);				//���� ���� 
		
		/*
		 * " �Ͽ�ȭ�������".charAt(1); => ��
		 * " �Ͽ�ȭ�������".charAt(2); => ��
		 */
		char dayofTheWeek = " �Ͽ�ȭ�������".charAt(dayofWeek);
		
		//3.���
		System.out.println(year +"�� "+ month +"�� "+ day +"���� ");
		System.out.println(dayofTheWeek + "�����Դϴ�.");
	}

}
