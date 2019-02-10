
package composition;


public class Composition {

    
    public static void main(String[] args) {
        NewClass1 obj1 = new NewClass1(9, 2, 1994);
        NewClass obj2 = new NewClass ("Gayathri",obj1);
        
        System.out.println(obj2);
    }
    
}
