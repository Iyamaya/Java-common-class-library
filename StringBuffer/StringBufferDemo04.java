public class StringBufferDemo04{
	public static void main(String args[]){
		StringBuffer buf = new StringBuffer() ;	// ����StringBuffer���� 
		buf.append("World!!") ;		// �������
		buf.insert(0,"Hello ") ;		// �ڵ�һ������֮ǰ�������
		String str = buf.reverse().toString() ;	// �����ݷ�ת���ΪString����
		System.out.println(str) ;		// ���������
	}
};