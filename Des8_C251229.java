
package des8_.c251229;
import java.util.Scanner;
public class Des8_C251229 {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
 System.out.print("Number of sections:");
 int x=sc.nextInt();
 System.out.print("Students per section:");
 int y=sc.nextInt();
 System.out.print("Number of students passed:");
 int z=sc.nextInt();
 double percent=((double)z/(x*y))*100;
 if(percent>50) {
 System.out.println("Percentage is strictly greater than 50%");
 } else {
 System.out.println("Percentage is not strictly greater than 50%");
 } 
    }
    
}
