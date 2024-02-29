package myutil;

import java.text.DecimalFormat;

public class DecimalFormatTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d1 = 2.523, d2 =3.123;
		double result = d1 +d2;
		System.out.println(result);
		
		DecimalFormat df = new DecimalFormat("#.##");
		String strResult = df.format(result);
		System.out.println(df.format(result));
		
		//double d =(double)strResult;//객체는 캐스팅이 안됨,객체는 비객체로 변환 안됨
		
		/*
		 * Wrapper 클래스 (java.lang)
		 */
		
		double d3 = Double.parseDouble(strResult);
	}

}
