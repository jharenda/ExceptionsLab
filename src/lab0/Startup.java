package lab0;

/**
 *
 * @author Instlogin
 */
public class Startup {

    public static void main(String[] args) {
 // I know this is probably terrible, but it sort of works for now.        
try {
      Employee   emp  = new Employee("Jim","Smith","33",22);
       String fullNameInCaps = 
                emp.getFirstName().toUpperCase() 
                + " " + emp.getLastName().toUpperCase();
       System.out.println(fullNameInCaps);
}catch (IllegalArgumentException e){
    System.out.println("error");
}
    
     
    }
    }




