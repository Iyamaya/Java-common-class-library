public class RuntimeDemo02{
	public static void main(String args[]){
		Runtime run = Runtime.getRuntime() ;	// ȡ��Runtime���ʵ��������
		try{
			run.exec("notepad.exe") ;	// ���ñ������򣬴˷�����Ҫ�쳣����
		}catch(Exception e){
			e.printStackTrace() ;	// ��ӡ�쳣��Ϣ
			// System.out.println(e) ;
		}
	}
};