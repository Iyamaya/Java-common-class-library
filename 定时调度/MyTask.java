// ��ɾ����������� 
import java.util.TimerTask ;
import java.util.Date ;
import java.text.SimpleDateFormat ;
class MyTask extends TimerTask{	// ��������඼Ҫ�̳�TimerTask
	public void run(){
		SimpleDateFormat sdf = null ;
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS") ;
		System.out.println("��ǰϵͳʱ��Ϊ��" + sdf.format(new Date())) ;
	}
};