import java.util.* ;
class Student{	// ָ������ΪStudent
	private String name ;
	private int age ;
	public Student(String name,int age){
		this.name = name ;
		this.age = age ;
	}
	public boolean equals(Object obj){	// ��дequals����
		if(this==obj){
			return true ;
		}
		if(!(obj instanceof Student)){
			return false ;
		}
		Student stu = (Student) obj ;
		if(stu.name.equals(this.name)&&stu.age==this.age){
			return true ;
		}else{
			return false ;
		}
	}
	public void setName(String name){
		this.name = name ;
	}
	public void setAge(int age){
		this.age = age ;
	}
	public String getName(){
		return this.name ;
	}
	public int getAge(){
		return this.age ;
	}
	public String toString(){
		return name + "\t\t" + this.age  ;
	}
};

class StudentComparator implements Comparator<Student>{	// ʵ�ֱȽ���
	// ��ΪObject���б����Ѿ�����equals()����
	public int compare(Student s1,Student s2){
		if(s1.equals(s2)){
			return 0 ;
		}else if(s1.getAge()<s2.getAge()){	// ������Ƚ�
			return 1 ;
		}else{
			return -1 ;
		}
	}
};

public class ComparatorDemo{
	public static void main(String args[]){
		Student stu[] = {new Student("����",20),
			new Student("����",22),new Student("����",20),
			new Student("����",20),new Student("����",22)} ;
		java.util.Arrays.sort(stu,new StudentComparator()) ;	// �����������
		for(int i=0;i<stu.length;i++){	// ѭ����������е�����
			System.out.println(stu[i]) ;
		}
	}
};