// A Java program to demonstrate working of a Class type
// object created by JVM to represent .class file in
// memory.
import java.lang.reflect.Field;
import java.lang.reflect.Method;
 


//A sample class whose information is fetched below using
//its Class object.
class Student
{
 private String name;
 private int roll_No;

 public String getName()  {  return name;   }
 public void setName(String name) { this.name = name; }
 public int getRoll_no()  { return roll_No;  }
 public void setRoll_no(int roll_no) {
     this.roll_No = roll_no;
 }
}


// Java code to demonstrate use of Class object
// created by JVM
public class JVMClass
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
 
        // Getting hold of Class object created
        // by JVM.
        Class c1 = s1.getClass();
 
        // Printing type of object using c1.
        System.out.println(c1.getName()+"\n");
 
        
        // getting all methods in an array
        Method m[] = c1.getDeclaredMethods();
        for (Method method : m)
            System.out.println(method.getName());
 
        System.out.println();
        // getting all fields in an array
        Field f[] = c1.getDeclaredFields();
        for (Field field : f)
            System.out.println(field.getName());
    }
}
 
