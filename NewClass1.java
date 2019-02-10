
package composition;


public class NewClass1 {
    private int day;
    private int month;
    private int year;
    
    public NewClass1(int d, int m, int y){
        day = d;
        month = m;
        year = y;
        
        System.out.printf("The Constructor of this is %s\n", this);
    }
    
    public String toString(){
        return String.format("%d/%d/%d", day, month, year);
    }
}
