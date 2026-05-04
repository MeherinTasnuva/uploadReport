
package des11_.c251229;
import java.util.Scanner;
public class Des11_C251229 {

    
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter kg of pulp:");
        int n=sc.nextInt();
        int pages=n*1000;
        int notebooks=pages/100;
        System.out.println("Number of notebook:"+notebooks);
           }
    
}
