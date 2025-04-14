package val;

public class variable01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����  ( ���� ������ �� �ִ� ���� ) ex) �ڽ�, �ٱ���
			
		int number1;	 //int : ������ ���� �ٱ��� �̸� : number1 
		int floor; 		// ������ ���� ���� ���� ( �����̸� : floor )
		
//		int x;
//		int y;		
//		int z;
			//�̸� �ߺ� �ȵ� 
		int x,y,z;
		
		int score; 		//���� ����
		int point = 50; // ���� ���� + �� ���� -> ���� �ʱ�ȭ
		
//		int score = 99; // �ߺ��� ������ ���Ұ�
		
		
		score = 90; //�� ����
		score = 80;
		score = 70; //�ڵ�� ���� ���������� �Ʒ��ִ°��� ����ȴ�.
		
		
		//hour = 15; //���� ���� ������ ���Ұ�
		int hour = 14; 	// 	���������� ���� ���� + �� ���� -> �ʱ�ȭ �����̸�:hour(�ð�)

		
		// seconds = 31 // ���� ���� ���� ��� �Ұ�
			
			int minute =14 ; // 
			
			minute = 21;
			minute = minute + 7;   
			score = point + 20;
		// int ���� + ���� + ���� + ����; ������ �ջ�
			int totalscore = point + point + score + score;
		//						50		50		70		70 
			// ��¹�

//			System.out.println(��ȣ�ȿ��ִ� ��/���� ���);
			System.out.println("�ȳ��ϼ���");
			System.out.println(500);
			System.out.println(totalscore);
			System.out.println(2*60 + 43); // sysout - > Ctrl + Space �ڵ��ϼ�
			System.out.println(hour + "��" + minute + "��" );
			
			x = 10;
//			x = 10 ���� 
			y = x;
//			y = x�ǰ��� y�� ������ 10
			z = x + y;
//			z = x + y�� x�� y�� ���� ��ó 20�� �����°� z�� ��ġ�°� �����ش�
			// x:10 y:10 z:20
			
			int a = 10;
			int b = 20;
			
			// a:10 b:20
			
			//��ǥ : ���� �� �ٲٱ�
			// 		a:20  b:10
			/* �ٲٱ� ���� ���̽�
			a = b; // 	a:20 b:20
			b = a ;//	a:20 b:20
			*/
			
			int c = a; 	//a:10 b:20 c:10  	c�� a���ִ� ���ڰ��� �����Ѵ�, (a:10)
				a = b; 	//a:20 b:20 c:10 	a�� b���ִ� ���ڰ��� �����Ѵ�, (b:20 > b:0)
				b = c; 	//a:20 b:10 c:10 	b�� c���ִ� ���ڰ��� �����Ѵ�, (c:0 > b:10)
				
			/* 	�ڹ� ���� ����,�Ǽ�,������ �����ϴ� ��8���� �⺻ Ÿ���� ����
			 *	����Ÿ�� : ��(truth) : ����(fail) �� ������ ���� 
			 */
			
			
				
				
				
			
				
			
	}

}
