import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("홍길동");//사이즈가 자동 증가,vector에선 Element가 좀더 다양한 기능 쓸수있음
		v.addElement(true);
		v.addElement(100);
		v.addElement(3.14);
		v.addElement('가');
		
		for(int i=0;i<v.size();i++) {
			System.out.println(v.elementAt(i));//get도 사용가능
		}
		
		System.out.println(v.capacity());//용량이 10개씩
		
		for(int i=0;i<7;i++) {
			v.addElement(i);
		}
		System.out.println(v.size());
		System.out.println(v.capacity());//용량이 10개가 넘어가면 10개증가
		
		v.trimToSize();
		System.out.println(v.capacity());//남는 공간없이 타이트하게
	}
}
