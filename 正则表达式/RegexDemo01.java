public class RegexDemo01{
	public static void main(String args[]){
		String str = "1234567890" ;		// ���ַ������������
		boolean flag = true ;			// ����һ����Ǳ���
		// Ҫ�Ƚ��ַ�����ֳ��ַ����飬֮�������ж�
		char c[] = str.toCharArray() ;	// ���ַ�����Ϊ�ַ�����
		for(int i=0;i<c.length;i++){	// ѭ�������ж�
			if(c[i]<'0'||c[i]>'9'){		// ����������������ʾ��������
				flag = false ;			// �������
				break ;					// ���������¼���ִ��
			}
		}
		if(flag){
			System.out.println("����������ɣ�") ;
		}else{
			System.out.println("������������ɣ�") ;
		}
	}
};