import java.util.regex.Pattern ;
import java.util.regex.Matcher ;
public class RegexDemo05{
	public static void main(String args[]){
		// Ҫ��������ַ�ȡ����Ҳ����˵�������ֲ��
		String str = "A1B22C333D4444E55555F" ;	// ָ����һ���ַ���
		String pat = "\\d+" ;	// ָ����������ʽ
		Pattern p = Pattern.compile(pat) ;	// ʵ����Pattern��
		Matcher m = p.matcher(str) ;	// ʵ����Matcher��Ķ���
		String newString = m.replaceAll("_") ;
		System.out.println(newString) ;
	}
};