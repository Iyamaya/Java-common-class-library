import java.util.Timer ;
public class TestTask{
	public static void main(String args[]){
		Timer t = new Timer() ;	// ����Timer�����
		MyTask mytask = new MyTask() ;	// ��������
		t.schedule(mytask,1000,2000) ;	// ���������ִ�У�1���ʼ��ÿ2���ظ�
	}
};