package val;

import java.awt.image.ByteLookupTable;

public class variable02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//	2, 8, 10, 16 ���� - ������
		int num2 = 0b1010; 	// 2���� : 10
		int num8 = 012; 	// 8���� : 10
		int num10 = 10; 	// 10����: 10
		int num16 = 0x30; 	// 16����: 48
		
		//���ǻ���: ��ȭ��ȣ ���ڸ�
		//int num = 010; ��ȭ��ȣ 010�� �ƴ϶� 8���� 10 ���� �ν��Ѵ�.
		//�������� "010"
		
		// char ���� Ÿ���� ������ �ϳ��� ���ڸ� �����Ҽ��ִ� Ư���� ����
		
		char ch1 = 123;  //������ ���� char : 0 ~ 65535(�����ڵ�) // �ڵ�ǥ�� �´� ���ڷ� �ٲ��
		char ch2 = 'B';  // ���� �Ѱ� 	'���� ����ǥ'
//		char ch3 = 'AB'; //���� �ΰ� 	��� �Ұ�
//		char ch3 = "A";  // ���� �Ѱ� 	'��������ǥ'  		"ū����ǥ" ���Ұ�
		
		System.out.println(ch1);	// �����ڵ�ǥ 123 �� ��Ÿ���� ���� { // �ƽ�Ű�ڵ� 
		System.out.println(ch2);
		
		String str1 = "AB";
		String str2 = "C";	//'C' ��������ǥ ���� �ϳ��� -> char Ÿ�Կ� ���
		
		String str3 = "�ѱ۹��ڿ�";
		String str4 = "01012345678";
		String str5 = "010-123-5678";
		
		System.out.println(str1);
		System.out.println(str3 + str5);
		
		String menu = "���� \"�ܹ��Ÿ�\"�����Ѵ�."; // ���� "�ܹ���"�� �����Ѵ�.
				// 	  (   )      	(      ) ū����ǥ�� �����ϴ� ���ڿ��� ������ ���������� �ִ´�, 
		System.out.println(menu);
		
		System.out.println("Hello\tworld\newlcome");
								// �������� \t�� ������ �����̽���ȿ��  \b�� ĭ �ٲٱ�
		
		double db1 = 12.12; // �Ǽ���
		double db2 = 0.1212e2; // 0.1212 * 10������  -> 12.12 
		float f1 = 12.12f; // float Ÿ�Կ� �Ǽ� ���ڰ� �����Ҷ��� �ڿ� f�� ���δ�.
		
		// ������ ��/���� true / flase 
		boolean stop = true;
		boolean start = false;
		boolean isHungry = true;
		
		
		
		
		
	}

}
