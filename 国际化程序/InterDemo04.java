public class InterDemo04{
	public static void main(String args[]){
		System.out.print("��һ�����У�") ;
		fun("LXH","Li","���˻�") ;	// ������������
		System.out.print("\n�ڶ������У�") ;
		fun("MLDN") ;				// ����һ������
	}
	public static void fun(Object...args){	// �̶��﷨���������������ݣ�ʹ�������ʾ
		for(int i=0;i<args.length;i++){
			System.out.print(args[i] + "��") ;
		}
	}
};