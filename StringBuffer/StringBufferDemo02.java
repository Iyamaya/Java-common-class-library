public class StringBufferDemo02{
	public static void main(String args[]){
		StringBuffer buf = new StringBuffer() ;	// ����StringBuffer���� 
		buf.append("Hello ") ;		
		fun(buf) ;		// ����StringBuffer���� 
		System.out.println(buf) ;	// ��ӡ����
	}
	public static void fun(StringBuffer s){		// ����StringBuffer����
		s.append("MLDN ").append("LiXingHua") ;	// �޸�StringBuffer������
	}
};