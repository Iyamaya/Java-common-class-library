import java.util.ResourceBundle ;
public class InterDemo01{
	public static void main(String args[]){
		ResourceBundle rb = ResourceBundle.getBundle("Message") ;	// �ҵ���Դ�ļ������ñ�д��׺
		System.out.println("���ݣ�" + rb.getString("info")) ;		// ����Դ�ļ���ȡ������
	}
};