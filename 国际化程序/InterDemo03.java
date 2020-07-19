import java.util.ResourceBundle ;
import java.util.Locale ;
import java.text.* ;
public class InterDemo03{
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
		String str1 = zhrb.getString("info") ;
		String str2 = enrb.getString("info") ;
		String str3 = frrb.getString("info") ;
		System.out.println("���ģ�" + MessageFormat.format(str1,"���˻�")) ;
		System.out.println("Ӣ�" + MessageFormat.format(str2,"LiXingHua")) ;
		System.out.println("���" + MessageFormat.format(str3,"LiXingHua")) ;
	}
};