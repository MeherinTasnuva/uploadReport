
package des9_.c251229;
import java.util.Scanner;
public class Des9_C251229 {

    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
 System.out.print("Enter work hour each day:");
 int x=sc.nextInt();
 System.out.print("Enter work hour on Wednesday:");
 int y=sc.nextInt();
 int total=(x*4)+y;
 System.out.println("total work hours in one week= "+total); 
    }
    
}
