import java.util.regex.Pattern ;
import java.util.regex.Matcher ;
public class RegexDemo04{
	public static void main(String args[]){
		// Ҫ��������ַ�ȡ����Ҳ����˵�������ֲ��
		String str = "A1B22C333D4444E55555F" ;	// ָ����һ���ַ���
		String pat = "\\d+" ;	// ָ����������ʽ
		Pattern p = Pattern.compile(pat) ;	// ʵ����Pattern��
		String s[] = p.split(str) ;	// ִ�в�ֲ���
		for(int x=0;x<s.length;x++){
			System.out.print(s[x] + "\t") ;
		}
	}
};