import java.util.* ;	// ������Ҫ�Ĺ��߰�
import java.text.* ;	// ����SimpleDateFormat���ڵİ�
class DateTime{		// �Ժ�ֱ��ͨ������Ϳ���ȡ������ʱ��
	private SimpleDateFormat sdf = null ;	// ����SimpleDateFormat����
	public String getDate(){		// �õ�����һ�����ڣ���ʽΪ��yyyy-MM-dd HH:mm:ss.SSS
		this.sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS") ;
		return this.sdf.format(new Date()) ;// ����ǰ���ڽ��и�ʽ������
	}
	public String getDateComplete(){		// �õ�����һ�����ڣ���ʽΪ��yyyy��MM��dd�� HHʱmm��ss��SSS����
		this.sdf = new SimpleDateFormat("yyyy��MM��dd��HHʱmm��ss��SSS����") ;
		return this.sdf.format(new Date()) ;// ����ǰ���ڽ��и�ʽ������
	}
	public String getTimeStamp(){		// �õ�����һ��ʱ���
		this.sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS") ;
		return this.sdf.format(new Date()) ;// ����ǰ���ڽ��и�ʽ������
	}
};
public class DateDemo07{
	public static void main(String args[]){
		DateTime dt = new DateTime() ;
		System.out.println("ϵͳ���ڣ�"+dt.getDate()) ;
		System.out.println("�������ڣ�"+dt.getDateComplete()) ;
		System.out.println("ʱ�����"+dt.getTimeStamp()) ;
	}
};