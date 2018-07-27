package p1;
class A2
{
		A2(int a)
		{
			System.out.println("Single");
			
		}
		A2(int a,int b)
		{
			
			System.out.println("Double");
		}
		
		A2(int... a){
			
			System.out.println("varargs");
			
			
		}
	//A2(int[] a){		System.out.println("Array");}



}


public class conVar {
  
	public static void main(String[] args)
	{
		
	A2 obj=new A2(2);
	A2 obj2=new A2(2,3);
	int[] ar= {2,3,5};
	//A2 obj5=new A2(ar);
	A2 obj3=new A2(2,3,5);
	A2 obj4=new A2();
	}
	
	}
