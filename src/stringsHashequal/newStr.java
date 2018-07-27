package stringsHashequal;

public class newStr {//String immutable check

	public static void main(String[] args) {
	
		String s="GeeksforGeeks";
		
	    String s1=s;
		String s2 = new String ("GeeksforGeeks");
		String s3 = null;
		//s3.intern();
		
//		s.intern();
//		s1.intern();
//		s2.intern();
//		s3.intern();
		
		 System.out.println(s.equals(s1)+" "+s1.equals(s2)+" "+s2.equals(s)+" ");
		 System.out.println((s==s1)+" "+(s1==s2)+" "+(s2==s)+" ");
		 System.out.println((s==s1));
		 s+="!!!!!";
		 System.out.println((s==s1));
		 System.out.println(s+" "+s1+" "+s2+" ");
		System.out.println(s.equals(s1)+" "+s1.equals(s2)+" "+s2.equals(s)+" "+s.equals(s3));
		System.out.println((s==s1)+" "+(s1==s2)+" "+(s2==s)+" "+(s==s3));
	
		
		System.out.println((s.intern())+" "+(s2.intern())+" "+(s.intern()==s1.intern())+" "+(s.intern()==s2.intern()));
	}	
}
