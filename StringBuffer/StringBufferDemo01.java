public class StringBufferDemo01{
	public static void main(String args[]){
		StringBuffer buf = new StringBuffer() ;	// ����StringBuffer���� 
		buf.append("Hello ") ;					// ��StringBuffer���������
		buf.append("World").append("!!!") ;		// ������������append()����
		buf.append("\n") ;						// ���һ��ת���ַ�
		buf.append("���� = ").append(1).append("\n") ;	// �������
		buf.append("�ַ� = ").append('C').append("\n");	 // ����ַ�
		buf.append("���� = ").append(true) ;	// ��Ӳ���ֵ
		System.out.println(buf) ;			// ֱ��������󣬵���toString()
	}
};