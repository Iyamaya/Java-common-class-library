public class RuntimeDemo01{
	public static void main(String args[]){
		Runtime run = Runtime.getRuntime();	// ͨ��Runtime��ľ�̬��������ʵ��������
		System.out.println("JVM����ڴ�����" + run.maxMemory()) ;	// �۲������ڴ棬���ݻ����Ĳ�ͬ������Ҳ��������ͬ
		System.out.println("JVM�����ڴ�����" + run.freeMemory()) ;	// ȡ�ó������еĿ����ڴ�
		String str = "Hello " + "World" + "!!!" 
				+"\t" + "Welcome " + "To " + "MLDN" + "~" ;
		System.out.println(str) ;
		for(int x=0;x<1000;x++){
			str += x ;			// ѭ���޸����ݣ�������������
		}
		System.out.println("����String֮���,JVM�����ڴ�����" + run.freeMemory()) ;
		run.gc() ;		// ���������ռ����ͷſռ�
		System.out.println("��������֮���,JVM�����ڴ�����" + run.freeMemory()) ;
	}
};