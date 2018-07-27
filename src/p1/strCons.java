package p1;

public class strCons {

	public static final String w = "Hello";
	public static void main(String[]args)
	{
		System.out.println(w);
		checkInhe ci=new checkInhe();
		inhe i=new inhe();
		checkInhe2 ci2=new checkInhe2();
		checkInhe cip=new inhe();

		System.out.println(" "+i.b+" "+i.c+" "+i.d);
		i.printer();
		i.show1();
		i.show2();
		i.show3();
	//	i.show4();
		
		System.out.println(ci.a+" "+ci.b+" "+ci.c);
		ci.printer();
		ci.show1();
		ci.show2();
		ci.show3();
	//	ci.show4();
		
		
		System.out.println(ci2.a+" "+ci2.b+" "+ci2.c);
		ci2.printer();
		ci2.show1();
		ci2.show2();
		ci2.show3();
	//	ci2.show4();
		
		System.out.println(cip.a+" "+cip.b+" "+cip.c+" ");
		cip.printer();
		cip.show1();
		cip.show2();
		cip.show3();
	//	ci2.show4(); 	
	}
}
