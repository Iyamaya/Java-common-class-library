import java.text.* ;
public class NumberFormatDemo01{
	public static void main(String args[]){
		NumberFormat nf = null ;		// ����һ��NumberFormat����
		nf = NumberFormat.getInstance() ;	// �õ�Ĭ�ϵ����ָ�ʽ����ʾ
		System.out.println("��ʽ��֮������֣�" + nf.format(10000000)) ;
		System.out.println("��ʽ��֮������֣�" + nf.format(1000.345)) ;
	}
};