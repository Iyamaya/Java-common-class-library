public class SystemDemo03{
	public static void main(String args[]){
		System.out.println("ϵͳ�汾��" + System.getProperty("os.name")
			+ System.getProperty("os.version")
			+ System.getProperty("os.arch")) ;
		System.out.println("ϵͳ�û���" + System.getProperty("user.name")) ;
		System.out.println("��ǰ�û�Ŀ¼��" + System.getProperty("user.home")) ;
		System.out.println("��ǰ�û�����Ŀ¼��" + System.getProperty("user.dir")) ;
	}
};