public class SystemDemo01{
	public static void main(String args[]){
		long startTime = System.currentTimeMillis() ;	// ȡ�ÿ�ʼ����֮ǰ��ʱ��
		int sum = 0 ;			// ��������
		for(int i=0;i<30000000;i++){	// ִ���ۼӲ���
			sum += i ;
		}
		long endTime = System.currentTimeMillis() ;	// ȡ�ü���֮���ʱ��
		// ����ʱ���ȥ��ʼʱ��
		System.out.println("���������ѵ�ʱ�䣺" + (endTime-startTime) +"����") ;
	}
};