public class StringBufferDemo06{
	public static void main(String args[]){
		StringBuffer buf = new StringBuffer() ;	// ����StringBuffer���� 
		buf.append("Hello ").append("World!!") ;		// ��StringBuffer�������
		buf.replace(6,11,"LiXingHua") ;		// ��world�������滻
		String str = buf.substring(6,15) ;	// ��ȡָ����Χ������
		System.out.println("�����滻֮��Ľ����" + str) ;	// �������
	}
};