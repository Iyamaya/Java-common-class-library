public class StringBufferDemo08{
	public static void main(String args[]){
		StringBuffer buf = new StringBuffer() ;	// ����StringBuffer���� 
		buf.append("Hello ").append("World!!") ;		// ��StringBuffer�������
		if(buf.indexOf("Hello")==-1){
			System.out.println("û�в��ҵ�ָ��������") ;
		}else{	// ��Ϊ01��ʾ���ҵ�����
			System.out.println("���Բ��ҵ�ָ��������") ;
		}
	}
};