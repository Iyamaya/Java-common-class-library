public class StringBufferDemo03{
	public static void main(String args[]){
		StringBuffer buf = new StringBuffer() ;	// ����StringBuffer���� 
		buf.append("World!!") ;		// �������
		buf.insert(0,"Hello ") ;		// �ڵ�һ������֮ǰ�������
		System.out.println(buf) ;
		buf.insert(buf.length(),"MLDN~") ;	// ������������
		System.out.println(buf) ;
	}
};