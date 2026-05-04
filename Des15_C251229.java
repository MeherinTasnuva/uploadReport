
package des15_.c251229;
import java.util.Scanner;

public class Des15_C251229 {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
 System.out.print("Alice's required temperature A: ");
 int A=sc.nextInt();
 System.out.print("Bob's required temperature B: ");
 int B=sc.nextInt();
 System.out.print("Charlie's required temperature C: ");
 int C=sc.nextInt();
 if(Math.max(A,C)<=B) {
 System.out.println("Yes");
 } else {
 System.out.println("No");
 }   
    }
    
}
