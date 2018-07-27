public class integerpool {
    public static void main(String args[]){
        Integer i1 = 100;
        Integer i2 = 100;
        // Comparison of integers from the pool - returns true.
        compareInts(i1, i2); 
        
        Integer i3 = 130;
        Integer i4 = 130;
        // Same comparison, but from outside the pool 
        // (not in the range -128 to 127)
        // resulting in false.
        compareInts(i3, i4); 

        Integer i5 = new Integer(100);
        Integer i6 = new Integer(100);
        // Comparison of Integers created using the 'new' keyword 
        // results in new instances and '==' comparison leads to false.
        compareInts(i5, i6); 
        
        int a=130,b=130;
        System.out.println((a==b));

    }

    private static void compareInts(Integer i1, Integer i2){
        System.out.println("Comparing Integers " + 
           i1 + "," + i2 + " results in: " + (i1 == i2) );
    }
}