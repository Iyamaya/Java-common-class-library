public class StringBufferDemo07{
	public static void main(String args[]){
		StringBuffer buf = new StringBuffer() ;	// ����StringBuffer���� 
		buf.append("Hello ").append("World!!") ;		// ��StringBuffer�������
		buf.replace(6,11,"LiXingHua") ;		// ��world�������滻
		String str = buf.delete(6,15).toString() ;	// ɾ��ָ����Χ�е�����
		System.out.println("ɾ��֮��Ľ����" + str) ;	// �������
	}
};