import java.util.* ;
class House extends Observable{	// ��ʾ���ӿ��Ա��۲�
	private float price ;// ��Ǯ
	public House(float price){
		this.price = price ;
	}
	public float getPrice(){
		return this.price ;
	}
	public void setPrice(float price){
		// ÿһ���޸ĵ�ʱ��Ӧ������۲��ߵ�ע��
		super.setChanged() ;	// ���ñ仯��
		super.notifyObservers(price) ;// �۸񱻸ı�
		this.price = price ;
	}
	public String toString(){
		return "���Ӽ۸�Ϊ��" + this.price ;
	}
}; 
class HousePriceObserver implements Observer{
	private String name ;
	public HousePriceObserver(String name){	// ����ÿһ�������ߵ�����
		this.name = name ;
	}
	public void update(Observable o,Object arg){
		if(arg instanceof Float){
			System.out.print(this.name + "�۲쵽�۸����Ϊ��") ;
			System.out.println(((Float)arg).floatValue()) ;
		}
	}
};
public class ObserDemo01{
	public static void main(String args[]){
		House h = new House(1000000) ;
		HousePriceObserver hpo1 = new HousePriceObserver("������A") ;
		HousePriceObserver hpo2 = new HousePriceObserver("������B") ;
		HousePriceObserver hpo3 = new HousePriceObserver("������C") ;
		h.addObserver(hpo1) ;
		h.addObserver(hpo2) ;
		h.addObserver(hpo3) ;
		System.out.println(h) ;	// ������Ӽ۸�
		h.setPrice(666666) ;	// �޸ķ��Ӽ۸�
		System.out.println(h) ;	// ������Ӽ۸�
	}
};