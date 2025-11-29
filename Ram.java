package myProject;

public class Ram {
	static String name;

	public static void main(String[] args) {
		String a = "jeff";
		C333 xx1 = new C333();
		Object start = new C33("hi", "hi2");
		System.out.println("9 : " + Ram.name);

	}

}

class C33 {
	C33(String a, String b) {

		Ram.name = a + b;
		System.out.println("17 : " + Ram.name + Ram.name);
	}
}

class C333 extends C33 {
	C333() {
		super("aalo", "kachalu");
		System.out.println("24 : " + Ram.name);

	}
}

/*
 * System.out.println("Hello");
 * 
 * String age = "31"+"87"; System.out.println("age"); char Random = 'P';
 * System.out.println(Random +",  "+age+","+"age");
 * 
 * 
 * boolean Male = false; System.out.println(Male); byte Marks = -128;
 * System.out.println(Marks); byte Marks1 = 127; System.out.println(Marks1);
 * short Income = -32768; System.out.println(Income); short Income1 = 32767;
 * System.out.println(Income1);
 * 
 * int Pincode = 302012; System.out.println(Pincode); float No = 1234567812345f;
 * Double Decimal = (double)2089045673; System.out.println(Decimal);
 * 
 * 
 * 
 * BigDecimal Decimal = new BigDecimal ("0.1"); BigDecimal Decimal1 = new
 * BigDecimal ("0.2"); BigDecimal sum = Decimal1+Decimal;
 * System.out.println("0.1+0.2="+sum);
 */
