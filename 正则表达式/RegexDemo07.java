import java.util.regex.Pattern ;
import java.util.regex.Matcher ;
public class RegexDemo07{
	public static void main(String args[]){
		String info = "LXH:98|MLDN:90|LI:100" ;			// ����һ���ַ���
		// ��ֵ���ʽ��
		/*
			LXH	-->	98
			MLDN	-->	90
			LI	-->	100
		*/
		String s[] = info.split("\\|") ;
		System.out.println("�ַ����Ĳ�֣�") ;
		for(int x=0;x<s.length;x++){
			String s2[] = s[x].split(":") ;
			System.out.println(s2[0] + "\t" + s2[1]) ;
		}
	}
};