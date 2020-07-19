import java.util.ResourceBundle ;
import java.util.Locale ;
public class InterDemo02{
	public static void main(String args[]){
		Locale zhLoc = new Locale("zh","CN") ;		// ��ʾ�й�����
		Locale enLoc = new Locale("en","US") ;		// ��ʾ��������
		Locale frLoc = new Locale("fr","FR") ;		// ��ʾ��������
		// �ҵ����ĵ������ļ�����Ҫָ�����ĵ�Locale����
		ResourceBundle zhrb = ResourceBundle.getBundle("Message",zhLoc) ;
		// �ҵ�Ӣ�ĵ������ļ�����Ҫָ��Ӣ�ĵ�Locale����
		ResourceBundle enrb = ResourceBundle.getBundle("Message",enLoc) ;
		// �ҵ����ĵ������ļ�����Ҫָ�����ĵ�Locale����
		ResourceBundle frrb = ResourceBundle.getBundle("Message",frLoc) ;
		// ���ζ�ȡ���������ļ������ݣ�ͨ����ֵ��ȡ����ʱ�ļ�ֵ����ͳһΪinfo
		System.out.println("����:" + zhrb.getString("info")) ;
		System.out.println("Ӣ�" + enrb.getString("info")) ;
		System.out.println("���" + frrb.getString("info")) ;
	}
};