public class RuntimeDemo03{
	public static void main(String args[]){
		Runtime run = Runtime.getRuntime() ;	// ȡ��Runtime���ʵ��������
		Process p = null ;	// ������̱���
		try{
			p = run.exec("notepad.exe") ;	// ���ñ������򣬴˷�����Ҫ�쳣����
		}catch(Exception e){
			e.printStackTrace() ;	// ��ӡ�쳣��Ϣ
			// System.out.println(e) ;
		}
		try{
			Thread.sleep(5000) ;	// �ô��̴߳��5��
		}catch(Exception e){
		}
		p.destroy() ;	// �����˽���
	}
};