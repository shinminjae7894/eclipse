public class CmsExt extends Cms{
	private String address;
	//Cms : 부모클래스(super),CmsExt : 자식클래스(sub)
	
	public CmsExt(int no,String name, char level, String address){
		//this.no = no;
		//this.name = name;
		//this.level = level;
		super(no, name, level);
		this.address = address;
	}
	/*
	void display() {
		System.out.println("고객번호: "+no);
		System.out.println("고객이름: "+name);
		System.out.println("고객등급: "+level);
	}
	*/

	void display() {
		super.display();//자신이 되므로 부모의 display로 해야함
		System.out.println("고객주소: " + address);
	}//부모가 물려준 display가져와서 사용
	public String toString() {
		return "[address: " + address + "]";
	}
}