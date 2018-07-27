public class testout {
public static void main(String ag[]) {
System.out.println("Starting commparison");
String a = "abc";
if(fun(a))
System.out.println("String is abc");
System.out.println("Comparison ends");
}

public static boolean fun(String a) {
return a == "abc";
}
}