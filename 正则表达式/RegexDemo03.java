import java.util.regex.Pattern ;
import java.util.regex.Matcher ;
public class RegexDemo03{
	public static void main(String args[]){
		String str = "1983-07-27" ;		// ָ����һ�����ڸ�ʽ���ַ���
		String pat = "\\d{4}-\\d{2}-\\d{2}" ;	// ָ����������ʽ
		Pattern p = Pattern.compile(pat) ;	// ʵ����Pattern��
		Matcher m = p.matcher(str) ;	// ʵ����Matcher��
		if(m.matches()){		// ������֤��ƥ�䣬ʹ������
			System.out.println("���ڸ�ʽ�Ϸ���") ;
		}else{
			System.out.println("���ڸ�ʽ���Ϸ���") ;
		}
	}
};