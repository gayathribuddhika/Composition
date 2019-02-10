
package composition;


public class NewClass {
      private String name;
      private NewClass1 birthday;
      
      public NewClass(String theName, NewClass1 theDate){
          name = theName;
          birthday = theDate;
      }
      
      public String toString(){
          return String.format("My name is %s and my birthday is %s ", name, birthday);
      }
}
