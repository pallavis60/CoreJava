 package com.xworkz.wrapperclass;

public class WrapperClass {

	public static void main(String[] args) {

		byte a1 = 100;
		byte a2 = 30;
		byte a3 = 50;
		byte a4 = 110;

		Byte val = Byte.valueOf(a1);
		System.out.println(val);
		Byte val1 = Byte.valueOf(a2);
		System.out.println(val1);

		Byte value = a3;
		System.out.println(value);
		Byte value1 = a4;
		System.out.println(value1);

		Byte values = val.byteValue();
		System.out.println(values);

		Byte values1 = value;
		System.out.println(values1);

		short b1 = 300;
		short b2 = 400;
		short b3 = 12000;
		short b4 = 5000;

		Short num = Short.valueOf(b1);
		System.out.println(num);
		Short num1 = Short.valueOf(b2);
		System.out.println(num1);

		Short numb = b3;
		System.out.println(numb);
		Short numb1 = b4;
		System.out.println(numb1);

		Short number = num.shortValue();
		System.out.println(number);

		Short number1 = numb;
		System.out.println(number1);

		int c1 = 400000;
		int c2 = 50000;
		int c3 = 100000;
		int c4 = 300000;

		Integer marks = Integer.valueOf(c1);
		System.out.println(marks);
		Integer marks1 = Integer.valueOf(c2);
		System.out.println(marks1);

		Integer mark = c3;
		System.out.println(mark);
		Integer mark1 = c4;
		System.out.println(mark1);

		Integer mark3 = marks.intValue();
		System.out.println(mark3);

		Integer mark4 = mark1;
		System.out.println(mark4);

		Long d1 = 9845835213L;
		Long d2 = 45637378822L;
		Long d3 = 6000000L;
		Long d4 = 783226666L;

		Long vall = Long.valueOf(d1);
		System.out.println(vall);
		Long vall1 = Long.valueOf(d2);
		System.out.println(vall1);

		Long vall2 = d3;
		System.out.println(vall2);
		Long vall3 = d4;
		System.out.println(vall3);

		Long vall5 = vall2.longValue();
		System.out.println(vall5);
		Long vall6 = vall;
		System.out.println(vall6);

		float e1 = 9.8f;
		float e2 = 7.8f;
		float e3 = 5.9f;
		float e4 = 9.9f;

		Float per = Float.valueOf(e1);
		System.out.println(per);
		Float per1 = Float.valueOf(e2);
		System.out.println(per1);

		Float per2 = e3;
		System.out.println(per2);
		Float per3 = e4;
		System.out.println(per3);

		Float percent = per.floatValue();
		System.out.println(percent);

		Float percent1 = per3;
		System.out.println(percent1);

		double f1 = 7.88D;
		double f2 = 8.999D;
		double f3 = 9.4562D;
		double f4 = 3.55666D;

		Double ans = Double.valueOf(f1);
		System.out.println(ans);

		Double ans1 = Double.valueOf(f2);
		System.out.println(ans1);

		Double ans2 = f3;
		System.out.println(ans2);

		Double ans3 = f4;
		System.out.println(ans3);

		Double ans4 = ans.doubleValue();
		System.out.println(ans4);
		Double ans5 = ans4;
		System.out.println(ans5);

		boolean g1 = true;
		boolean g2 = false;
		boolean g3 = true;
		boolean g4 = false;

		Boolean res = Boolean.valueOf(g1);
		System.out.println(res);
		Boolean res1 = Boolean.valueOf(g2);
		System.out.println(res1);

		Boolean res2 = g3;
		System.out.println(res2);
		Boolean res3 = g4;
		System.out.println(res3);

		Boolean res4 = res.booleanValue();
		System.out.println(res4);
		Boolean res5 = res1.booleanValue();
		System.out.println(res5);

		char h1 = 'A';
		char h2 = 'B';
		char h3 = 'C';
		char h4 = 'D';

		Character vitamin = Character.valueOf(h4);
		System.out.println(vitamin);
		Character vitamin1 = Character.valueOf(h2);
		System.out.println(vitamin1);

		Character vitamin2 = h1;
		System.out.println(vitamin2);

		Character vitamin3 = h3;
		System.out.println(vitamin3);

		Character vitamin4 = vitamin.charValue();
		System.out.println(vitamin4);
		Character vitamin5 = vitamin3;
		System.out.println(vitamin5);

	}

}
