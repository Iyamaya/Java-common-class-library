public class InterDemo05{
	public static void main(String args[]){
		System.out.print("��һ�����У�") ;
		Object[] arg1 = {"LXH","Li","���˻�"} ;
		fun(arg1) ;	// ������������
		System.out.print("\n�ڶ������У�") ;
		Object[] arg2 = {"MLDN"} ;
		fun(arg2) ;				// ����һ������
		System.out.print("\n���������У�") ;
		Object[] arg3 = {} ;		// û�в�������
		fun(arg3) ;
	}
	public static void fun(Object...args){	// �̶��﷨���������������ݣ�ʹ�������ʾ
		for(int i=0;i<args.length;i++){
			System.out.print(args[i] + "��") ;
		}
	}
};