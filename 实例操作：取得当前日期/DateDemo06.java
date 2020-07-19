import java.util.* ;	// ������Ҫ�Ĺ��߰�
class DateTime{		// �Ժ�ֱ��ͨ������Ϳ���ȡ������ʱ��
	private Calendar calendar = null ;		// ����һ��Calendar����ȡ��ʱ��
	public DateTime(){						// ���췽����ֱ��ʵ��������
		this.calendar = new GregorianCalendar() ;	
	}
	public String getDate(){		// �õ�����һ�����ڣ���ʽΪ��yyyy-MM-dd HH:mm:ss.SSS
		// ���ǵ�����ҪƵ���޸��ַ���������ʹ��StringBuffer��������
		StringBuffer buf = new StringBuffer() ;
		buf.append(calendar.get(Calendar.YEAR)).append("-") ;	// ������
		buf.append(this.addZero(calendar.get(Calendar.MONTH)+1,2)).append("-") ;	// ������
		buf.append(this.addZero(calendar.get(Calendar.DAY_OF_MONTH),2)).append(" ") ;	// ȡ����
		buf.append(this.addZero(calendar.get(Calendar.HOUR_OF_DAY),2)).append(":") ;	// ȡ��ʱ
		buf.append(this.addZero(calendar.get(Calendar.MINUTE),2)).append(":") ;
		buf.append(this.addZero(calendar.get(Calendar.SECOND),2)).append(".") ;
		buf.append(this.addZero(calendar.get(Calendar.MILLISECOND),3)) ;
		return buf.toString() ;
	}
	public String getDateComplete(){		// �õ�����һ�����ڣ���ʽΪ��yyyy��MM��dd�� HHʱmm��ss��SSS����
		// ���ǵ�����ҪƵ���޸��ַ���������ʹ��StringBuffer��������
		StringBuffer buf = new StringBuffer() ;
		buf.append(calendar.get(Calendar.YEAR)).append("��") ;	// ������
		buf.append(this.addZero(calendar.get(Calendar.MONTH)+1,2)).append("��") ;	// ������
		buf.append(this.addZero(calendar.get(Calendar.DAY_OF_MONTH),2)).append("��") ;	// ȡ����
		buf.append(this.addZero(calendar.get(Calendar.HOUR_OF_DAY),2)).append("ʱ") ;	// ȡ��ʱ
		buf.append(this.addZero(calendar.get(Calendar.MINUTE),2)).append("��") ;		// ȡ�÷�
		buf.append(this.addZero(calendar.get(Calendar.SECOND),2)).append("��") ;		// ȡ����
		buf.append(this.addZero(calendar.get(Calendar.MILLISECOND),3)).append("����") ;	 // ȡ�ú���
		return buf.toString() ;
	}
	public String getTimeStamp(){		// �õ�����һ��ʱ���
		// ���ǵ�����ҪƵ���޸��ַ���������ʹ��StringBuffer��������
		StringBuffer buf = new StringBuffer() ;
		buf.append(calendar.get(Calendar.YEAR)) ;	// ������
		buf.append(this.addZero(calendar.get(Calendar.MONTH)+1,2)) ;	// ������
		buf.append(this.addZero(calendar.get(Calendar.DAY_OF_MONTH),2)) ;	// ȡ����
		buf.append(this.addZero(calendar.get(Calendar.HOUR_OF_DAY),2)) ;	// ȡ��ʱ
		buf.append(this.addZero(calendar.get(Calendar.MINUTE),2)) ;		// ȡ�÷�
		buf.append(this.addZero(calendar.get(Calendar.SECOND),2));		// ȡ����
		buf.append(this.addZero(calendar.get(Calendar.MILLISECOND),3)) ;	 // ȡ�ú���
		return buf.toString() ;
	}
	// ���ǵ������д���ǰ��0�������ڴ˴����ϲ���ķ���
	private String addZero(int num,int len){
		StringBuffer s = new StringBuffer() ;
		s.append(num) ;
		while(s.length()<len){	// ������Ȳ��㣬�������0
			s.insert(0,"0") ;	// �ڵ�һ��λ�ô���0
		}
		return s.toString() ;
	}
};
public class DateDemo06{
	public static void main(String args[]){
		DateTime dt = new DateTime() ;
		System.out.println("ϵͳ���ڣ�"+dt.getDate()) ;
		System.out.println("�������ڣ�"+dt.getDateComplete()) ;
		System.out.println("ʱ�����"+dt.getTimeStamp()) ;
	}
};