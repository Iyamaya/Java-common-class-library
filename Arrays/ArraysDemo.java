import java.util.* ;
public class ArraysDemo{
	public static void main(String arg[]){
		int temp[] = {3,4,5,7,9,1,2,6,8} ;	// ����һ����������
		Arrays.sort(temp) ;		// ��������Ĳ���
		System.out.print("���������飺") ;
		System.out.println(Arrays.toString(temp)) ;	// ���ַ����������
		// ���Ҫ��ʹ�ö��ַ���ѯ�Ļ��������������֮�������
		int point = Arrays.binarySearch(temp,3) ;	// ����λ��
		System.out.println("Ԫ�ء�3����λ���ڣ�" + point) ;
		Arrays.fill(temp,3)	;// �������
		System.out.print("������䣺") ;
		System.out.println(Arrays.toString(temp)) ;
	}
};