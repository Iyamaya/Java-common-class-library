public class StringBufferDemo10{
	public static void main(String args[]){
		StringBuffer buf = new StringBuffer() ;
		buf.append("LiXingHua") ;
		for(int i=0;i<100;i++){
			buf.append(i);		// StringBuffer�����޸ģ����ܸ�
		}
		System.out.println(buf) ;
	}
};