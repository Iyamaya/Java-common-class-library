import java.util.ResourceBundle ;
import java.util.Locale ;
import java.text.* ;
public class InterDemo06{
	public static void main(String args[]){
		Locale zhLoc = new Locale("zh","CN") ;		// ��ʾ�й�����
		// �ҵ����ĵ������ļ�����Ҫָ�����ĵ�Locale����
		ResourceBundle zhrb = ResourceBundle.getBundle("Message",zhLoc) ;
		String str1 = zhrb.getString("info") ;
		System.out.println("����:" + MessageFormat.format(str1,"���˻�")) ;
	}
};