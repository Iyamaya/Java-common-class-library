public class StringBufferDemo05{
	public static void main(String args[]){
		StringBuffer buf = new StringBuffer() ;	// ����StringBuffer���� 
		buf.append("Hello ").append("World!!") ;		// ��StringBuffer�������
		buf.replace(6,11,"LiXingHua") ;		// ��world�������滻
		System.out.println("�����滻֮��Ľ����" + buf) ;	// �������
	}
};