import java.util.regex.Pattern ;
import java.util.regex.Matcher ;
public class RegexDemo06{
	public static void main(String args[]){
		String str1 = "A1B22C333D4444E55555F".replaceAll("\\d+","_") ;
		boolean temp = "1983-07-27".matches("\\d{4}-\\d{2}-\\d{2}") ;
		String s[] = "A1B22C333D4444E55555F".split("\\d+") ;
		System.out.println("�ַ����滻������" + str1) ;
		System.out.println("�ַ�����֤��" + temp) ;
		System.out.print("�ַ����Ĳ�֣�") ;
		for(int x=0;x<s.length;x++){
			System.out.print(s[x] + "\t") ;
		}
	}
};