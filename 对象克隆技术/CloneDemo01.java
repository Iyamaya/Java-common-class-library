class Person implements Cloneable{	// ʵ��Cloneable�ӿڱ�ʾ���Ա���¡ 
	private String name ;
	public Person(String name){
		this.name = name ;
	}
	public void setName(String name){
		this.name = name ;
	}
	public String getName(){
		return this.name ;
	}
	public String toString(){
		return "������" + this.name ;
	}
	public Object clone()
                throws CloneNotSupportedException
	{
		return super.clone() ;	// ����Ŀ�¡�����ɸ������
	}
};
public class CloneDemo01{
	public static void main(String args[]) throws Exception{
		Person p1 = new Person("����") ;
		Person p2 = (Person)p1.clone() ;
		p2.setName("����") ;
		System.out.println("ԭʼ����" + p1) ;
		System.out.println("��¡֮��Ķ���" + p2) ;
	}
};